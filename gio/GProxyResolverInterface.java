package gio;
import gio.GIOLibrary.GAsyncReadyCallback;
import gio.GIOLibrary.GAsyncResult;
import gio.GIOLibrary.GProxyResolver;
import gio.GIOLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
import org.bridj.util.DefaultParameterizedType;
/**
 * <i>native declaration : glib-2.0/gio/gproxyresolver.h:16</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GProxyResolverInterface extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GTypeInterface (Unsupported type) */
	/** C type : lookup_callback* */
	@Field(1) 
	public Pointer<GProxyResolverInterface.lookup_callback > lookup() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : lookup_callback* */
	@Field(1) 
	public GProxyResolverInterface lookup(Pointer<GProxyResolverInterface.lookup_callback > lookup) {
		this.io.setPointerField(this, 1, lookup);
		return this;
	}
	/** C type : lookup_async_callback* */
	@Field(2) 
	public Pointer<GProxyResolverInterface.lookup_async_callback > lookup_async() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : lookup_async_callback* */
	@Field(2) 
	public GProxyResolverInterface lookup_async(Pointer<GProxyResolverInterface.lookup_async_callback > lookup_async) {
		this.io.setPointerField(this, 2, lookup_async);
		return this;
	}
	/** C type : lookup_finish_callback* */
	@Field(3) 
	public Pointer<GProxyResolverInterface.lookup_finish_callback > lookup_finish() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : lookup_finish_callback* */
	@Field(3) 
	public GProxyResolverInterface lookup_finish(Pointer<GProxyResolverInterface.lookup_finish_callback > lookup_finish) {
		this.io.setPointerField(this, 3, lookup_finish);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gproxyresolver.h:12</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GProxyResolver > resolver) {
			apply(Pointer.getPeer(resolver));
		}
		public abstract void apply(@Ptr long resolver);
	};
	/** <i>native declaration : glib-2.0/gio/gproxyresolver.h:13</i> */
	public static abstract class lookup_callback extends Callback<lookup_callback > {
		public final Pointer<Pointer<Byte > > apply(Pointer<GProxyResolver > resolver, Pointer<Byte > uri, Pointer<GCancellable > cancellable, Pointer<Pointer > error) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(resolver), Pointer.getPeer(uri), Pointer.getPeer(cancellable), Pointer.getPeer(error)), DefaultParameterizedType.paramType(Pointer.class, Byte.class));
		}
		@Ptr 
		public abstract long apply(@Ptr long resolver, @Ptr long uri, @Ptr long cancellable, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gproxyresolver.h:14</i> */
	public static abstract class lookup_async_callback extends Callback<lookup_async_callback > {
		public final void apply(Pointer<GProxyResolver > resolver, Pointer<Byte > uri, Pointer<GCancellable > cancellable, Pointer<GAsyncReadyCallback > callback, gpointer user_data) {
			apply(Pointer.getPeer(resolver), Pointer.getPeer(uri), Pointer.getPeer(cancellable), Pointer.getPeer(callback), user_data);
		}
		public abstract void apply(@Ptr long resolver, @Ptr long uri, @Ptr long cancellable, @Ptr long callback, gpointer user_data);
	};
	/** <i>native declaration : glib-2.0/gio/gproxyresolver.h:15</i> */
	public static abstract class lookup_finish_callback extends Callback<lookup_finish_callback > {
		public final Pointer<Pointer<Byte > > apply(Pointer<GProxyResolver > resolver, Pointer<GAsyncResult > result, Pointer<Pointer > error) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(resolver), Pointer.getPeer(result), Pointer.getPeer(error)), DefaultParameterizedType.paramType(Pointer.class, Byte.class));
		}
		@Ptr 
		public abstract long apply(@Ptr long resolver, @Ptr long result, @Ptr long error);
	};
}
