package glib;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/glib/gutils.h:76</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GLib") 
public class GDebugKey extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : const gchar* */
	@Field(0) 
	public Pointer<Byte > key() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : const gchar* */
	@Field(0) 
	public GDebugKey key(Pointer<Byte > key) {
		this.io.setPointerField(this, 0, key);
		return this;
	}
	/** C type : guint */
	@Field(1) 
	public int value() {
		return this.io.getIntField(this, 1);
	}
	/** C type : guint */
	@Field(1) 
	public GDebugKey value(int value) {
		this.io.setIntField(this, 1, value);
		return this;
	}
	public GDebugKey() {
		super();
	}
	public GDebugKey(Pointer pointer) {
		super(pointer);
	}
}
