package glib;
import org.bridj.BridJ;
import org.bridj.CLong;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/glib/gvariant.h:182</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GLib") 
public class GVariantIter extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * < private ><br>
	 * C type : gsize[16]
	 */
	@Array({16}) 
	@Field(0) 
	public Pointer<CLong > x() {
		return this.io.getPointerField(this, 0);
	}
	public GVariantIter() {
		super();
	}
	public GVariantIter(Pointer pointer) {
		super(pointer);
	}
}
