package gtk;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Bits;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
/**
 * <i>native declaration : glib-2.0/glib/gtypes.h:53</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Union 
@Library("Gtk") 
public class GFloatIEEE754 extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : gfloat */
	@Field(0) 
	public float v_float() {
		return this.io.getFloatField(this, 0);
	}
	/** C type : gfloat */
	@Field(0) 
	public GFloatIEEE754 v_float(float v_float) {
		this.io.setFloatField(this, 0, v_float);
		return this;
	}
	/** C type : mpn_struct */
	@Field(1) 
	public GFloatIEEE754.mpn_struct mpn() {
		return this.io.getNativeObjectField(this, 1);
	}
	/** C type : mpn_struct */
	@Field(1) 
	public GFloatIEEE754 mpn(GFloatIEEE754.mpn_struct mpn) {
		this.io.setNativeObjectField(this, 1, mpn);
		return this;
	}
	/** <i>native declaration : glib-2.0/glib/gtypes.h:52</i> */
	public static class mpn_struct extends StructObject {
		static {
			BridJ.register();
		}
		/** C type : guint */
		@Field(0) 
		@Bits(23) 
		public int mantissa() {
			return this.io.getIntField(this, 0);
		}
		/** C type : guint */
		@Field(0) 
		@Bits(23) 
		public mpn_struct mantissa(int mantissa) {
			this.io.setIntField(this, 0, mantissa);
			return this;
		}
		/** C type : guint */
		@Field(1) 
		@Bits(8) 
		public int biased_exponent() {
			return this.io.getIntField(this, 1);
		}
		/** C type : guint */
		@Field(1) 
		@Bits(8) 
		public mpn_struct biased_exponent(int biased_exponent) {
			this.io.setIntField(this, 1, biased_exponent);
			return this;
		}
		/** C type : guint */
		@Field(2) 
		@Bits(1) 
		public int sign() {
			return this.io.getIntField(this, 2);
		}
		/** C type : guint */
		@Field(2) 
		@Bits(1) 
		public mpn_struct sign(int sign) {
			this.io.setIntField(this, 2, sign);
			return this;
		}
		public mpn_struct() {
			super();
		}
		public mpn_struct(Pointer pointer) {
			super(pointer);
		}
	};
	public GFloatIEEE754() {
		super();
	}
	public GFloatIEEE754(Pointer pointer) {
		super(pointer);
	}
}