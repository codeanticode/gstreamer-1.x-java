package gio;
import gio.GIOLibrary.GSocketClientEvent;
import gio.GIOLibrary.GSocketConnectable;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : glib-2.0/gio/gsocketclient.h:16</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GSocketClientClass extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GObjectClass (Unsupported type) */
	/** C type : event_callback* */
	@Field(1) 
	public Pointer<GSocketClientClass.event_callback > event() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : event_callback* */
	@Field(1) 
	public GSocketClientClass event(Pointer<GSocketClientClass.event_callback > event) {
		this.io.setPointerField(this, 1, event);
		return this;
	}
	/**
	 * Padding for future expansion<br>
	 * C type : _g_reserved1_callback*
	 */
	@Field(2) 
	public Pointer<gio.GVfsClass._g_reserved1_callback > _g_reserved1() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * Padding for future expansion<br>
	 * C type : _g_reserved1_callback*
	 */
	@Field(2) 
	public GSocketClientClass _g_reserved1(Pointer<gio.GVfsClass._g_reserved1_callback > _g_reserved1) {
		this.io.setPointerField(this, 2, _g_reserved1);
		return this;
	}
	/** C type : _g_reserved2_callback* */
	@Field(3) 
	public Pointer<gio.GVfsClass._g_reserved2_callback > _g_reserved2() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : _g_reserved2_callback* */
	@Field(3) 
	public GSocketClientClass _g_reserved2(Pointer<gio.GVfsClass._g_reserved2_callback > _g_reserved2) {
		this.io.setPointerField(this, 3, _g_reserved2);
		return this;
	}
	/** C type : _g_reserved3_callback* */
	@Field(4) 
	public Pointer<gio.GVfsClass._g_reserved3_callback > _g_reserved3() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : _g_reserved3_callback* */
	@Field(4) 
	public GSocketClientClass _g_reserved3(Pointer<gio.GVfsClass._g_reserved3_callback > _g_reserved3) {
		this.io.setPointerField(this, 4, _g_reserved3);
		return this;
	}
	/** C type : _g_reserved4_callback* */
	@Field(5) 
	public Pointer<gio.GVfsClass._g_reserved4_callback > _g_reserved4() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : _g_reserved4_callback* */
	@Field(5) 
	public GSocketClientClass _g_reserved4(Pointer<gio.GVfsClass._g_reserved4_callback > _g_reserved4) {
		this.io.setPointerField(this, 5, _g_reserved4);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gsocketclient.h:11</i> */
	public static abstract class event_callback extends Callback<event_callback > {
		public final void apply(Pointer<GSocketClient > client, IntValuedEnum<GSocketClientEvent > event, Pointer<GSocketConnectable > connectable, Pointer<GIOStream > connection) {
			apply(Pointer.getPeer(client), (int)event.value(), Pointer.getPeer(connectable), Pointer.getPeer(connection));
		}
		public abstract void apply(@Ptr long client, int event, @Ptr long connectable, @Ptr long connection);
	};
	/** <i>native declaration : glib-2.0/gio/gsocketclient.h:12</i> */
	public static abstract class _g_reserved1_callback extends Callback<_g_reserved1_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocketclient.h:13</i> */
	public static abstract class _g_reserved2_callback extends Callback<_g_reserved2_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocketclient.h:14</i> */
	public static abstract class _g_reserved3_callback extends Callback<_g_reserved3_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocketclient.h:15</i> */
	public static abstract class _g_reserved4_callback extends Callback<_g_reserved4_callback > {
		public abstract void apply();
	};
}