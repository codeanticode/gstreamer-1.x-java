package glib;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/glib/garray.h:8</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GLib") 
public class GArray extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : gchar* */
	@Field(0) 
	public Pointer<Byte > data() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : gchar* */
	@Field(0) 
	public GArray data(Pointer<Byte > data) {
		this.io.setPointerField(this, 0, data);
		return this;
	}
	/** C type : guint */
	@Field(1) 
	public int len() {
		return this.io.getIntField(this, 1);
	}
	/** C type : guint */
	@Field(1) 
	public GArray len(int len) {
		this.io.setIntField(this, 1, len);
		return this;
	}
	public GArray() {
		super();
	}
	public GArray(Pointer pointer) {
		super(pointer);
	}
}
