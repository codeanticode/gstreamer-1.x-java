package glib;
import glib.GLibLibrary.GSourceDummyMarshal;
import glib.GLibLibrary.gboolean;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : glib-2.0/glib/gmain.h:147</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GLib") 
public abstract class GSourceFuncs extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : prepare_callback* */
	@Field(0) 
	public Pointer<GSourceFuncs.prepare_callback > prepare() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : prepare_callback* */
	@Field(0) 
	public GSourceFuncs prepare(Pointer<GSourceFuncs.prepare_callback > prepare) {
		this.io.setPointerField(this, 0, prepare);
		return this;
	}
	/** C type : check_callback* */
	@Field(1) 
	public Pointer<GSourceFuncs.check_callback > check() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : check_callback* */
	@Field(1) 
	public GSourceFuncs check(Pointer<GSourceFuncs.check_callback > check) {
		this.io.setPointerField(this, 1, check);
		return this;
	}
	/** C type : dispatch_callback* */
	@Field(2) 
	public Pointer<GSourceFuncs.dispatch_callback > dispatch() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : dispatch_callback* */
	@Field(2) 
	public GSourceFuncs dispatch(Pointer<GSourceFuncs.dispatch_callback > dispatch) {
		this.io.setPointerField(this, 2, dispatch);
		return this;
	}
	/**
	 * Can be NULL<br>
	 * C type : finalize_callback*
	 */
	@Field(3) 
	public Pointer<GSourceFuncs.finalize_callback > finalize$() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * Can be NULL<br>
	 * C type : finalize_callback*
	 */
	@Field(3) 
	public GSourceFuncs finalize$(Pointer<GSourceFuncs.finalize_callback > finalize$) {
		this.io.setPointerField(this, 3, finalize$);
		return this;
	}
	/** Conversion Error : GSourceFunc (failed to convert type to Java (undefined type)) */
	/**
	 * Really is of type GClosureMarshal<br>
	 * C type : GSourceDummyMarshal
	 */
	@Field(5) 
	public Pointer<GSourceDummyMarshal > closure_marshal() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * Really is of type GClosureMarshal<br>
	 * C type : GSourceDummyMarshal
	 */
	@Field(5) 
	public GSourceFuncs closure_marshal(Pointer<GSourceDummyMarshal > closure_marshal) {
		this.io.setPointerField(this, 5, closure_marshal);
		return this;
	}
	/** <i>native declaration : glib-2.0/glib/gmain.h:143</i> */
	public static abstract class prepare_callback extends Callback<prepare_callback > {
		public final gboolean apply(Pointer<GSource > source, Pointer<Integer > timeout_) {
			return apply(Pointer.getPeer(source), Pointer.getPeer(timeout_));
		}
		public abstract gboolean apply(@Ptr long source, @Ptr long timeout_);
	};
	/** <i>native declaration : glib-2.0/glib/gmain.h:144</i> */
	public static abstract class check_callback extends Callback<check_callback > {
		public final gboolean apply(Pointer<GSource > source) {
			return apply(Pointer.getPeer(source));
		}
		public abstract gboolean apply(@Ptr long source);
	};
	/** <i>native declaration : glib-2.0/glib/gmain.h:145</i> */
	public static abstract class dispatch_callback extends Callback<dispatch_callback > {
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmain.h</i><br>
		 * gboolean dispatch_callback(GSource* source, GSourceFunc callback, gpointer user_data);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmain.h</i><br>
		 * gboolean dispatch_callback(GSource* source, GSourceFunc callback, gpointer user_data);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
	};
	/** <i>native declaration : glib-2.0/glib/gmain.h:146</i> */
	public static abstract class finalize_callback extends Callback<finalize_callback > {
		public final void apply(Pointer<GSource > source) {
			apply(Pointer.getPeer(source));
		}
		public abstract void apply(@Ptr long source);
	};
}
