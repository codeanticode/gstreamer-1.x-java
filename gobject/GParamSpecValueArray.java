package gobject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GParamSpecValueArray:<br>
 * @parent_instance: private #GParamSpec portion<br>
 * @element_spec: a #GParamSpec describing the elements contained in arrays of this property, may be %NULL<br>
 * @fixed_n_elements: if greater than 0, arrays of this property will always have this many elements<br>
 * <br>
 * A #GParamSpec derived structure that contains the meta data for #GValueArray properties.<br>
 * <i>native declaration : glib-2.0/gobject/gparamspecs.h:293</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GParamSpecValueArray extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GParamSpec */
	@Field(0) 
	public GParamSpec parent_instance() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : GParamSpec */
	@Field(0) 
	public GParamSpecValueArray parent_instance(GParamSpec parent_instance) {
		this.io.setNativeObjectField(this, 0, parent_instance);
		return this;
	}
	/** C type : GParamSpec* */
	@Field(1) 
	public Pointer<GParamSpec > element_spec() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : GParamSpec* */
	@Field(1) 
	public GParamSpecValueArray element_spec(Pointer<GParamSpec > element_spec) {
		this.io.setPointerField(this, 1, element_spec);
		return this;
	}
	/** C type : guint */
	@Field(2) 
	public int fixed_n_elements() {
		return this.io.getIntField(this, 2);
	}
	/** C type : guint */
	@Field(2) 
	public GParamSpecValueArray fixed_n_elements(int fixed_n_elements) {
		this.io.setIntField(this, 2, fixed_n_elements);
		return this;
	}
	public GParamSpecValueArray() {
		super();
	}
	public GParamSpecValueArray(Pointer pointer) {
		super(pointer);
	}
}