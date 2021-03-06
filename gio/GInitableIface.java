package gio;
import gio.GIOLibrary.GInitable;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * GInitableIface:<br>
 * @g_iface: The parent interface.<br>
 * @init: Initializes the object.<br>
 * * Provides an interface for initializing object such that initialization<br>
 * may fail.<br>
 * * Since: 2.22<br>
 * <i>native declaration : glib-2.0/gio/ginitable.h:20</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GInitableIface extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GTypeInterface (Unsupported type) */
	/** <i>native declaration : glib-2.0/gio/ginitable.h:19</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GInitable > initable, Pointer<GCancellable > cancellable, Pointer<Pointer > error) {
			apply(Pointer.getPeer(initable), Pointer.getPeer(cancellable), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long initable, @Ptr long cancellable, @Ptr long error);
	};
}
