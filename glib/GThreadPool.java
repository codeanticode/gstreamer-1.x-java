package glib;
import glib.GLibLibrary.GFunc;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/glib/gthreadpool.h:6</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GLib") 
public abstract class GThreadPool extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GFunc */
	@Field(0) 
	public Pointer<GFunc > func() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : GFunc */
	@Field(0) 
	public GThreadPool func(Pointer<GFunc > func) {
		this.io.setPointerField(this, 0, func);
		return this;
	}
	/** Conversion Error : gpointer (Unsupported type) */
	/**
	 * Failed to convert value exclusive of type gboolean<br>
	 * C type : gboolean
	 */
}
