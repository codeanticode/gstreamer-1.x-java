package gio;
import gio.GIOLibrary.GDBusSubtreeDispatchFunc;
import gio.GIOLibrary.GDBusSubtreeEnumerateFunc;
import gio.GIOLibrary.GDBusSubtreeIntrospectFunc;
import gio.GIOLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GDBusSubtreeVTable:<br>
 * @enumerate: Function for enumerating child nodes.<br>
 * @introspect: Function for introspecting a child node.<br>
 * @dispatch: Function for dispatching a remote call on a child node.<br>
 * * Virtual table for handling subtrees registered with g_dbus_connection_register_subtree().<br>
 * * Since: 2.26<br>
 * <i>native declaration : glib-2.0/gio/gdbusconnection.h:249</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public class GDBusSubtreeVTable extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GDBusSubtreeEnumerateFunc */
	@Field(0) 
	public Pointer<GDBusSubtreeEnumerateFunc > enumerate() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : GDBusSubtreeEnumerateFunc */
	@Field(0) 
	public GDBusSubtreeVTable enumerate(Pointer<GDBusSubtreeEnumerateFunc > enumerate) {
		this.io.setPointerField(this, 0, enumerate);
		return this;
	}
	/** C type : GDBusSubtreeIntrospectFunc */
	@Field(1) 
	public Pointer<GDBusSubtreeIntrospectFunc > introspect() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : GDBusSubtreeIntrospectFunc */
	@Field(1) 
	public GDBusSubtreeVTable introspect(Pointer<GDBusSubtreeIntrospectFunc > introspect) {
		this.io.setPointerField(this, 1, introspect);
		return this;
	}
	/** C type : GDBusSubtreeDispatchFunc */
	@Field(2) 
	public Pointer<GDBusSubtreeDispatchFunc > dispatch() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : GDBusSubtreeDispatchFunc */
	@Field(2) 
	public GDBusSubtreeVTable dispatch(Pointer<GDBusSubtreeDispatchFunc > dispatch) {
		this.io.setPointerField(this, 2, dispatch);
		return this;
	}
	/**
	 * Padding for future expansion - also remember to update<br>
	 * gdbusconnection.c:_g_dbus_subtree_vtable_copy() when<br>
	 * changing this.<br>
	 * C type : gpointer[8]
	 */
	@Array({8}) 
	@Field(3) 
	public Pointer<gpointer > padding() {
		return this.io.getPointerField(this, 3);
	}
	public GDBusSubtreeVTable() {
		super();
	}
	public GDBusSubtreeVTable(Pointer pointer) {
		super(pointer);
	}
}
