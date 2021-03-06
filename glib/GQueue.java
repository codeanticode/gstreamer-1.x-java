package glib;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GQueue:<br>
 * @head: a pointer to the first element of the queue<br>
 * @tail: a pointer to the last element of the queue<br>
 * @length: the number of elements in the queue<br>
 * * Contains the public fields of a<br>
 * <link linkend="glib-Double-ended-Queues">Queue</link>.<br>
 * <i>native declaration : glib-2.0/glib/gqueue.h:14</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GLib") 
public class GQueue extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GList* */
	@Field(0) 
	public Pointer<GList > head() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : GList* */
	@Field(0) 
	public GQueue head(Pointer<GList > head) {
		this.io.setPointerField(this, 0, head);
		return this;
	}
	/** C type : GList* */
	@Field(1) 
	public Pointer<GList > tail() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : GList* */
	@Field(1) 
	public GQueue tail(Pointer<GList > tail) {
		this.io.setPointerField(this, 1, tail);
		return this;
	}
	/** C type : guint */
	@Field(2) 
	public int length() {
		return this.io.getIntField(this, 2);
	}
	/** C type : guint */
	@Field(2) 
	public GQueue length(int length) {
		this.io.setIntField(this, 2, length);
		return this;
	}
	public GQueue() {
		super();
	}
	public GQueue(Pointer pointer) {
		super(pointer);
	}
}
