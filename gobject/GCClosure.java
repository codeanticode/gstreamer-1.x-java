package gobject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * closure for C function calls, callback() is the user function<br>
 * <i>native declaration : glib-2.0/gobject/gclosure.h:95</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GCClosure extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GClosure */
	@Field(0) 
	public GClosure closure() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : GClosure */
	@Field(0) 
	public GCClosure closure(GClosure closure) {
		this.io.setNativeObjectField(this, 0, closure);
		return this;
	}
	/**
	 * Failed to convert value callback of type gpointer<br>
	 * C type : gpointer
	 */
	public GCClosure() {
		super();
	}
	public GCClosure(Pointer pointer) {
		super(pointer);
	}
}
