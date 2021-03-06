package gio;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/gio/gtcpwrapperconnection.h:5</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public class GTcpWrapperConnectionClass extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GTcpConnectionClass */
	@Field(0) 
	public GTcpConnectionClass parent_class() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : GTcpConnectionClass */
	@Field(0) 
	public GTcpWrapperConnectionClass parent_class(GTcpConnectionClass parent_class) {
		this.io.setNativeObjectField(this, 0, parent_class);
		return this;
	}
	public GTcpWrapperConnectionClass() {
		super();
	}
	public GTcpWrapperConnectionClass(Pointer pointer) {
		super(pointer);
	}
}
