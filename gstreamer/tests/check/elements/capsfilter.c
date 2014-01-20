/* GStreamer unit test for capsfilter
 * Copyright (C) <2008> Tim-Philipp Müller <tim centricular net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA 02110-1301, USA.
 */

#include <gst/check/gstcheck.h>

#define CAPS_TEMPLATE_STRING            \
    "audio/x-raw, "                     \
    "channels = (int) [ 1, 2], "        \
    "rate = (int) [ 1,  MAX ]"

static GstStaticPadTemplate sinktemplate = GST_STATIC_PAD_TEMPLATE ("sink",
    GST_PAD_SINK,
    GST_PAD_ALWAYS,
    GST_STATIC_CAPS (CAPS_TEMPLATE_STRING)
    );

GST_START_TEST (test_unfixed_downstream_caps)
{
  GstElement *pipe, *src, *filter;
  GstCaps *filter_caps;
  GstPad *mysinkpad;
  GstMessage *msg;

  pipe = gst_check_setup_element ("pipeline");

  src = gst_check_setup_element ("fakesrc");
  g_object_set (src, "sizetype", 2, "sizemax", 1024, "num-buffers", 1, NULL);

  filter = gst_check_setup_element ("capsfilter");
  filter_caps = gst_caps_from_string ("audio/x-raw, rate=(int)44100");
  fail_unless (filter_caps != NULL);
  g_object_set (filter, "caps", filter_caps, NULL);

  gst_bin_add_many (GST_BIN (pipe), src, filter, NULL);
  fail_unless (gst_element_link (src, filter));

  mysinkpad = gst_check_setup_sink_pad (filter, &sinktemplate);
  gst_pad_set_active (mysinkpad, TRUE);

  fail_unless_equals_int (gst_element_set_state (pipe, GST_STATE_PLAYING),
      GST_STATE_CHANGE_SUCCESS);

  /* wait for error on bus */
  msg = gst_bus_poll (GST_ELEMENT_BUS (pipe),
      GST_MESSAGE_EOS | GST_MESSAGE_ERROR, -1);

  fail_if (GST_MESSAGE_TYPE (msg) != GST_MESSAGE_ERROR,
      "Expected ERROR message, got EOS message");
  gst_message_unref (msg);

  /* We don't expect any output buffers unless the check fails */
  fail_unless (buffers == NULL);

  /* cleanup */
  GST_DEBUG ("cleanup");

  gst_pad_set_active (mysinkpad, FALSE);
  gst_check_teardown_sink_pad (filter);
  gst_check_teardown_element (pipe);
  gst_caps_unref (filter_caps);
}

GST_END_TEST;

GST_START_TEST (test_caps_property)
{
  GstElement *filter;
  GstCaps *filter_caps, *caps;
  const gchar *caps_str;

  filter = gst_check_setup_element ("capsfilter");

  /* verify that the set caps are actually set */
  caps_str = "audio/x-raw, rate=(int)44100, channels=(int)1";

  filter_caps = gst_caps_from_string (caps_str);
  fail_unless (GST_IS_CAPS (filter_caps));
  g_object_set (filter, "caps", filter_caps, NULL);

  g_object_get (filter, "caps", &caps, NULL);
  fail_unless (gst_caps_is_equal (caps, filter_caps));
  gst_caps_unref (caps);
  gst_caps_unref (filter_caps);

  /* verify that new caps set replace the old ones */
  caps_str = "video/x-raw, width=(int)320, height=(int)240";

  filter_caps = gst_caps_from_string (caps_str);
  fail_unless (GST_IS_CAPS (filter_caps));
  g_object_set (filter, "caps", filter_caps, NULL);

  g_object_get (filter, "caps", &caps, NULL);
  fail_unless (gst_caps_is_equal (caps, filter_caps));
  gst_caps_unref (caps);
  gst_caps_unref (filter_caps);

  /* make sure that NULL caps is interpreted as ANY */
  g_object_set (filter, "caps", NULL, NULL);

  g_object_get (filter, "caps", &filter_caps, NULL);
  fail_unless (gst_caps_is_any (filter_caps));
  gst_caps_unref (filter_caps);

  gst_object_unref (filter);
}

GST_END_TEST;

GST_START_TEST (test_caps_query)
{
  GstElement *filter;
  GstCaps *filter_caps;
  const gchar *caps_str;
  GstQuery *query;
  GstCaps *caps;

  filter = gst_check_setup_element ("capsfilter");

  /* set some caps, do a caps query with a filter resulting in no
   * intersecting caps */
  caps_str = "audio/x-raw, rate=(int)44100, channels=(int)1";

  filter_caps = gst_caps_from_string (caps_str);
  fail_unless (GST_IS_CAPS (filter_caps));
  g_object_set (filter, "caps", filter_caps, NULL);
  gst_caps_unref (filter_caps);

  caps_str = "video/x-raw, width=(int)320, height=(int)240";
  filter_caps = gst_caps_from_string (caps_str);
  query = gst_query_new_caps (filter_caps);
  gst_caps_unref (filter_caps);
  fail_unless (gst_element_query (filter, query));
  gst_query_parse_caps_result (query, &caps);
  fail_unless (gst_caps_is_empty (caps));
  gst_query_unref (query);

  gst_object_unref (filter);
}

GST_END_TEST;

GST_START_TEST (test_accept_caps_query)
{
  GstElement *filter;
  GstCaps *filter_caps;
  const gchar *caps_str;
  GstQuery *query;
  gboolean accepted;
  GstPad *sinkpad;
  GstPad *srcpad;

  filter = gst_check_setup_element ("capsfilter");

  /* set some caps on (both pads of) the capsfilter */
  caps_str = "audio/x-raw, rate=(int)44100, channels=(int)1";

  filter_caps = gst_caps_from_string (caps_str);
  fail_unless (GST_IS_CAPS (filter_caps));
  g_object_set (filter, "caps", filter_caps, NULL);
  gst_caps_unref (filter_caps);

  sinkpad = gst_element_get_static_pad (filter, "sink");

  /* check that the set caps are acceptable on the sinkpad */
  caps_str = "audio/x-raw, rate=(int)44100, channels=(int)1";
  filter_caps = gst_caps_from_string (caps_str);
  query = gst_query_new_accept_caps (filter_caps);
  gst_caps_unref (filter_caps);
  fail_unless (gst_pad_query (sinkpad, query));
  gst_query_parse_accept_caps_result (query, &accepted);
  fail_unless (accepted);
  gst_query_unref (query);

  /* and that unrelated caps are not acceptable */
  caps_str = "video/x-raw, width=(int)320, height=(int)240";
  filter_caps = gst_caps_from_string (caps_str);
  query = gst_query_new_accept_caps (filter_caps);
  gst_caps_unref (filter_caps);
  fail_unless (gst_pad_query (sinkpad, query));
  gst_query_parse_accept_caps_result (query, &accepted);
  fail_unless (!accepted);
  gst_query_unref (query);

  gst_object_unref (sinkpad);

  /* now do the same for the src pad (which has the same caps) */
  srcpad = gst_element_get_static_pad (filter, "src");

  caps_str = "audio/x-raw, rate=(int)44100, channels=(int)1";
  filter_caps = gst_caps_from_string (caps_str);
  query = gst_query_new_accept_caps (filter_caps);
  gst_caps_unref (filter_caps);
  fail_unless (gst_pad_query (srcpad, query));
  gst_query_parse_accept_caps_result (query, &accepted);
  fail_unless (accepted);
  gst_query_unref (query);

  caps_str = "video/x-raw, width=(int)320, height=(int)240";
  filter_caps = gst_caps_from_string (caps_str);
  query = gst_query_new_accept_caps (filter_caps);
  gst_caps_unref (filter_caps);
  fail_unless (gst_pad_query (srcpad, query));
  gst_query_parse_accept_caps_result (query, &accepted);
  fail_unless (!accepted);
  gst_query_unref (query);

  gst_object_unref (srcpad);

  gst_object_unref (filter);
}

GST_END_TEST;

static Suite *
capsfilter_suite (void)
{
  Suite *s = suite_create ("capsfilter");
  TCase *tc_chain = tcase_create ("general");

  suite_add_tcase (s, tc_chain);
  tcase_add_test (tc_chain, test_unfixed_downstream_caps);
  tcase_add_test (tc_chain, test_caps_property);
  tcase_add_test (tc_chain, test_caps_query);
  tcase_add_test (tc_chain, test_accept_caps_query);

  return s;
}

GST_CHECK_MAIN (capsfilter)
