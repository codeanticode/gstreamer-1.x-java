package gio;
import gio.GIOLibrary.GFileAttributeInfoFlags;
import gio.GIOLibrary.GFileAttributeType;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GFileAttributeInfo:<br>
 * @name: the name of the attribute.<br>
 * @type: the #GFileAttributeType type of the attribute.<br>
 * @flags: a set of #GFileAttributeInfoFlags.<br>
 * * Information about a specific attribute.<br>
 * <i>native declaration : glib-2.0/gio/gfileattribute.h:12</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public class GFileAttributeInfo extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : char* */
	@Field(0) 
	public Pointer<Byte > name() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : char* */
	@Field(0) 
	public GFileAttributeInfo name(Pointer<Byte > name) {
		this.io.setPointerField(this, 0, name);
		return this;
	}
	/** C type : GFileAttributeType */
	@Field(1) 
	public IntValuedEnum<GFileAttributeType > type() {
		return this.io.getEnumField(this, 1);
	}
	/** C type : GFileAttributeType */
	@Field(1) 
	public GFileAttributeInfo type(IntValuedEnum<GFileAttributeType > type) {
		this.io.setEnumField(this, 1, type);
		return this;
	}
	/** C type : GFileAttributeInfoFlags */
	@Field(2) 
	public IntValuedEnum<GFileAttributeInfoFlags > flags() {
		return this.io.getEnumField(this, 2);
	}
	/** C type : GFileAttributeInfoFlags */
	@Field(2) 
	public GFileAttributeInfo flags(IntValuedEnum<GFileAttributeInfoFlags > flags) {
		this.io.setEnumField(this, 2, flags);
		return this;
	}
	public GFileAttributeInfo() {
		super();
	}
	public GFileAttributeInfo(Pointer pointer) {
		super(pointer);
	}
}
