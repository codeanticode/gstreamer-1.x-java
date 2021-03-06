package gio;
import gio.GIOLibrary.GDBusInterface;
import gio.GIOLibrary.GDBusObject;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * GDBusObjectIface:<br>
 * @parent_iface: The parent interface.<br>
 * @get_object_path: Returns the object path. See g_dbus_object_get_object_path().<br>
 * @get_interfaces: Returns all interfaces. See g_dbus_object_get_interfaces().<br>
 * @get_interface: Returns an interface by name. See g_dbus_object_get_interface().<br>
 * @interface_added: Signal handler for the #GDBusObject::interface-added signal.<br>
 * @interface_removed: Signal handler for the #GDBusObject::interface-removed signal.<br>
 * * Base object type for D-Bus objects.<br>
 * * Since: 2.30<br>
 * <i>native declaration : glib-2.0/gio/gdbusobject.h:27</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GDBusObjectIface extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GTypeInterface (Unsupported type) */
	/**
	 * Virtual Functions<br>
	 * C type : get_object_path_callback*
	 */
	@Field(1) 
	public Pointer<gio.GDBusObjectManagerIface.get_object_path_callback > get_object_path() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * Virtual Functions<br>
	 * C type : get_object_path_callback*
	 */
	@Field(1) 
	public GDBusObjectIface get_object_path(Pointer<gio.GDBusObjectManagerIface.get_object_path_callback > get_object_path) {
		this.io.setPointerField(this, 1, get_object_path);
		return this;
	}
	/** C type : get_interfaces_callback* */
	@Field(2) 
	public Pointer<GDBusObjectIface.get_interfaces_callback > get_interfaces() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : get_interfaces_callback* */
	@Field(2) 
	public GDBusObjectIface get_interfaces(Pointer<GDBusObjectIface.get_interfaces_callback > get_interfaces) {
		this.io.setPointerField(this, 2, get_interfaces);
		return this;
	}
	/** C type : get_interface_callback* */
	@Field(3) 
	public Pointer<gio.GDBusObjectManagerIface.get_interface_callback > get_interface() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : get_interface_callback* */
	@Field(3) 
	public GDBusObjectIface get_interface(Pointer<gio.GDBusObjectManagerIface.get_interface_callback > get_interface) {
		this.io.setPointerField(this, 3, get_interface);
		return this;
	}
	/**
	 * Signals<br>
	 * C type : interface_added_callback*
	 */
	@Field(4) 
	public Pointer<gio.GDBusObjectManagerIface.interface_added_callback > interface_added() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * Signals<br>
	 * C type : interface_added_callback*
	 */
	@Field(4) 
	public GDBusObjectIface interface_added(Pointer<gio.GDBusObjectManagerIface.interface_added_callback > interface_added) {
		this.io.setPointerField(this, 4, interface_added);
		return this;
	}
	/** C type : interface_removed_callback* */
	@Field(5) 
	public Pointer<gio.GDBusObjectManagerIface.interface_removed_callback > interface_removed() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : interface_removed_callback* */
	@Field(5) 
	public GDBusObjectIface interface_removed(Pointer<gio.GDBusObjectManagerIface.interface_removed_callback > interface_removed) {
		this.io.setPointerField(this, 5, interface_removed);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gdbusobject.h:22</i> */
	public static abstract class get_object_path_callback extends Callback<get_object_path_callback > {
		public final Pointer<Byte > apply(Pointer<GDBusObject > object) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(object)), Byte.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long object);
	};
	/** <i>native declaration : glib-2.0/gio/gdbusobject.h:23</i> */
	public static abstract class get_interfaces_callback extends Callback<get_interfaces_callback > {
		public final Pointer apply(Pointer<GDBusObject > object) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(object)));
		}
		@Ptr 
		public abstract long apply(@Ptr long object);
	};
	/** <i>native declaration : glib-2.0/gio/gdbusobject.h:24</i> */
	public static abstract class get_interface_callback extends Callback<get_interface_callback > {
		public final Pointer<GDBusInterface > apply(Pointer<GDBusObject > object, Pointer<Byte > interface_name) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(object), Pointer.getPeer(interface_name)), GDBusInterface.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long object, @Ptr long interface_name);
	};
	/** <i>native declaration : glib-2.0/gio/gdbusobject.h:25</i> */
	public static abstract class interface_added_callback extends Callback<interface_added_callback > {
		public final void apply(Pointer<GDBusObject > object, Pointer<GDBusInterface > interface_) {
			apply(Pointer.getPeer(object), Pointer.getPeer(interface_));
		}
		public abstract void apply(@Ptr long object, @Ptr long interface_);
	};
	/** <i>native declaration : glib-2.0/gio/gdbusobject.h:26</i> */
	public static abstract class interface_removed_callback extends Callback<interface_removed_callback > {
		public final void apply(Pointer<GDBusObject > object, Pointer<GDBusInterface > interface_) {
			apply(Pointer.getPeer(object), Pointer.getPeer(interface_));
		}
		public abstract void apply(@Ptr long object, @Ptr long interface_);
	};
}
