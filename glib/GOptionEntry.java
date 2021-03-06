package glib;
import glib.GLibLibrary.GOptionArg;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GOptionEntry:<br>
 * @long_name: The long name of an option can be used to specify it<br>
 *  in a commandline as --<replaceable>long_name</replaceable>. Every<br>
 *  option must have a long name. To resolve conflicts if multiple<br>
 *  option groups contain the same long name, it is also possible to<br>
 *  specify the option as <br>
 *  --<replaceable>groupname</replaceable>-<replaceable>long_name</replaceable>.<br>
 * @short_name: If an option has a short name, it can be specified<br>
 *  -<replaceable>short_name</replaceable> in a commandline. @short_name must be <br>
 *  a printable ASCII character different from '-', or zero if the option has no<br>
 *  short name.<br>
 * @flags: Flags from #GOptionFlags.<br>
 * @arg: The type of the option, as a #GOptionArg.<br>
 * @arg_data: If the @arg type is %G_OPTION_ARG_CALLBACK, then @arg_data must <br>
 *  point to a #GOptionArgFunc callback function, which will be called to handle <br>
 *  the extra argument. Otherwise, @arg_data is a pointer to a location to store <br>
 *  the value, the required type of the location depends on the @arg type:<br>
 *  <variablelist><br>
 *  <varlistentry><br>
 *  <term>%G_OPTION_ARG_NONE</term><br>
 *  <listitem><para>%gboolean</para></listitem><br>
 *  </varlistentry><br>
 *  <varlistentry><br>
 *  <term>%G_OPTION_ARG_STRING</term><br>
 *  <listitem><para>%gchar*</para></listitem><br>
 *  </varlistentry><br>
 *  <varlistentry><br>
 *  <term>%G_OPTION_ARG_INT</term><br>
 *  <listitem><para>%gint</para></listitem><br>
 *  </varlistentry><br>
 *  <varlistentry><br>
 *  <term>%G_OPTION_ARG_FILENAME</term><br>
 *  <listitem><para>%gchar*</para></listitem><br>
 *  </varlistentry><br>
 *  <varlistentry><br>
 *  <term>%G_OPTION_ARG_STRING_ARRAY</term><br>
 *  <listitem><para>%gchar**</para></listitem><br>
 *  </varlistentry><br>
 *  <varlistentry><br>
 *  <term>%G_OPTION_ARG_FILENAME_ARRAY</term><br>
 *  <listitem><para>%gchar**</para></listitem><br>
 *  </varlistentry><br>
 *  <varlistentry><br>
 *  <term>%G_OPTION_ARG_DOUBLE</term><br>
 *  <listitem><para>%gdouble</para></listitem><br>
 *  </varlistentry><br>
 *  </variablelist><br>
 *  If @arg type is %G_OPTION_ARG_STRING or %G_OPTION_ARG_FILENAME the location<br>
 *  will contain a newly allocated string if the option was given. That string<br>
 *  needs to be freed by the callee using g_free(). Likewise if @arg type is<br>
 *  %G_OPTION_ARG_STRING_ARRAY or %G_OPTION_ARG_FILENAME_ARRAY, the data should<br>
 *  be freed using g_strfreev().<br>
 * @description: the description for the option in <option>--help</option><br>
 *  output. The @description is translated using the @translate_func of the<br>
 *  group, see g_option_group_set_translation_domain().<br>
 * @arg_description: The placeholder to use for the extra argument parsed<br>
 *  by the option in <option>--help</option><br>
 *  output. The @arg_description is translated using the @translate_func of the<br>
 *  group, see g_option_group_set_translation_domain().<br>
 * <br>
 * A <structname>GOptionEntry</structname> defines a single option.<br>
 * To have an effect, they must be added to a #GOptionGroup with<br>
 * g_option_context_add_main_entries() or g_option_group_add_entries().<br>
 * <i>native declaration : glib-2.0/glib/goption.h:224</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GLib") 
public abstract class GOptionEntry extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : const gchar* */
	@Field(0) 
	public Pointer<Byte > long_name() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : const gchar* */
	@Field(0) 
	public GOptionEntry long_name(Pointer<Byte > long_name) {
		this.io.setPointerField(this, 0, long_name);
		return this;
	}
	/** C type : gchar */
	@Field(1) 
	public byte short_name() {
		return this.io.getByteField(this, 1);
	}
	/** C type : gchar */
	@Field(1) 
	public GOptionEntry short_name(byte short_name) {
		this.io.setByteField(this, 1, short_name);
		return this;
	}
	/** C type : gint */
	@Field(2) 
	public int flags() {
		return this.io.getIntField(this, 2);
	}
	/** C type : gint */
	@Field(2) 
	public GOptionEntry flags(int flags) {
		this.io.setIntField(this, 2, flags);
		return this;
	}
	/** C type : GOptionArg */
	@Field(3) 
	public IntValuedEnum<GOptionArg > arg() {
		return this.io.getEnumField(this, 3);
	}
	/** C type : GOptionArg */
	@Field(3) 
	public GOptionEntry arg(IntValuedEnum<GOptionArg > arg) {
		this.io.setEnumField(this, 3, arg);
		return this;
	}
	/** Conversion Error : gpointer (Unsupported type) */
	/** C type : const gchar* */
	@Field(5) 
	public Pointer<Byte > description() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : const gchar* */
	@Field(5) 
	public GOptionEntry description(Pointer<Byte > description) {
		this.io.setPointerField(this, 5, description);
		return this;
	}
	/** C type : const gchar* */
	@Field(6) 
	public Pointer<Byte > arg_description() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : const gchar* */
	@Field(6) 
	public GOptionEntry arg_description(Pointer<Byte > arg_description) {
		this.io.setPointerField(this, 6, arg_description);
		return this;
	}
}
