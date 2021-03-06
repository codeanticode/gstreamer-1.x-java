package gobject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GParamSpecGType:<br>
 * @parent_instance: private #GParamSpec portion<br>
 * @is_a_type: a #GType whose subtypes can occur as values<br>
 * <br>
 * A #GParamSpec derived structure that contains the meta data for #GType properties.<br>
 * <br>
 * Since: 2.10<br>
 * <i>native declaration : glib-2.0/gobject/gparamspecs.h:334</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GParamSpecGType extends StructObject {
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
	public GParamSpecGType parent_instance(GParamSpec parent_instance) {
		this.io.setNativeObjectField(this, 0, parent_instance);
		return this;
	}
	/** C type : GType */
	@CLong 
	@Field(1) 
	public long is_a_type() {
		return this.io.getCLongField(this, 1);
	}
	/** C type : GType */
	@CLong 
	@Field(1) 
	public GParamSpecGType is_a_type(long is_a_type) {
		this.io.setCLongField(this, 1, is_a_type);
		return this;
	}
	public GParamSpecGType() {
		super();
	}
	public GParamSpecGType(Pointer pointer) {
		super(pointer);
	}
}
