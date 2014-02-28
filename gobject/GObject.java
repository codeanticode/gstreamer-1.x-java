package gobject;
import org.bridj.BridJ;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GObject:<br>
 * <br>
 * All the fields in the <structname>GObject</structname> structure are private <br>
 * to the #GObject implementation and should never be accessed directly.<br>
 * <i>native declaration : glib-2.0/gobject/gobject.h:58</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public abstract class GObject extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GTypeInstance */
	@Field(0) 
	public GTypeInstance g_type_instance() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : GTypeInstance */
	@Field(0) 
	public GObject g_type_instance(GTypeInstance g_type_instance) {
		this.io.setNativeObjectField(this, 0, g_type_instance);
		return this;
	}
	/**
	 * < private ><br>
	 * C type : volatile guint
	 */
	@Field(1) 
	public int ref_count() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * < private ><br>
	 * C type : volatile guint
	 */
	@Field(1) 
	public GObject ref_count(int ref_count) {
		this.io.setIntField(this, 1, ref_count);
		return this;
	}
	/** Conversion Error : GData* (failed to convert type to Java (undefined type)) */
}