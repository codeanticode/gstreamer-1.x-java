package glib;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * N-way tree implementation<br>
 * <i>native declaration : glib-2.0/glib/gnode.h:37</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GLib") 
public abstract class GNode extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : gpointer (Unsupported type) */
	/** C type : GNode* */
	@Field(1) 
	public Pointer<GNode > next() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : GNode* */
	@Field(1) 
	public GNode next(Pointer<GNode > next) {
		this.io.setPointerField(this, 1, next);
		return this;
	}
	/** C type : GNode* */
	@Field(2) 
	public Pointer<GNode > prev() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : GNode* */
	@Field(2) 
	public GNode prev(Pointer<GNode > prev) {
		this.io.setPointerField(this, 2, prev);
		return this;
	}
	/** C type : GNode* */
	@Field(3) 
	public Pointer<GNode > parent() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : GNode* */
	@Field(3) 
	public GNode parent(Pointer<GNode > parent) {
		this.io.setPointerField(this, 3, parent);
		return this;
	}
	/** C type : GNode* */
	@Field(4) 
	public Pointer<GNode > children() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : GNode* */
	@Field(4) 
	public GNode children(Pointer<GNode > children) {
		this.io.setPointerField(this, 4, children);
		return this;
	}
}
