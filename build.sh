#!/bin/sh

cd glib
java -jar ../jnaerator.jar ../gobject.jnaerator -mode Directory -f -v
cd ..

cd gstreamer
java -jar ../jnaerator.jar ../gstreamer.jnaerator -mode Directory -f -v
cd ..