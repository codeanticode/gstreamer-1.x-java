package gobject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GFlagsClass:<br>
 * @g_type_class: the parent class<br>
 * @mask: a mask covering all possible values.<br>
 * @n_values: the number of possible values.<br>
 * @values: an array of #GFlagsValue structs describing the <br>
 *  individual values.<br>
 * <br>
 * The class of a flags type holds information about its <br>
 * possible values.<br>
 * <i>native declaration : glib-2.0/gobject/genums.h:43</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GFlagsClass extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GTypeClass */
	@Field(0) 
	public GTypeClass g_type_class() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : GTypeClass */
	@Field(0) 
	public GFlagsClass g_type_class(GTypeClass g_type_class) {
		this.io.setNativeObjectField(this, 0, g_type_class);
		return this;
	}
	/**
	 * < public ><br>
	 * C type : guint
	 */
	@Field(1) 
	public int mask() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * < public ><br>
	 * C type : guint
	 */
	@Field(1) 
	public GFlagsClass mask(int mask) {
		this.io.setIntField(this, 1, mask);
		return this;
	}
	/** C type : guint */
	@Field(2) 
	public int n_values() {
		return this.io.getIntField(this, 2);
	}
	/** C type : guint */
	@Field(2) 
	public GFlagsClass n_values(int n_values) {
		this.io.setIntField(this, 2, n_values);
		return this;
	}
	/** C type : GFlagsValue* */
	@Field(3) 
	public Pointer<GFlagsValue > values() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : GFlagsValue* */
	@Field(3) 
	public GFlagsClass values(Pointer<GFlagsValue > values) {
		this.io.setPointerField(this, 3, values);
		return this;
	}
	public GFlagsClass() {
		super();
	}
	public GFlagsClass(Pointer pointer) {
		super(pointer);
	}
}
