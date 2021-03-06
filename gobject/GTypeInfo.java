package gobject;
import gobject.GObjectLibrary.GBaseFinalizeFunc;
import gobject.GObjectLibrary.GBaseInitFunc;
import gobject.GObjectLibrary.GClassFinalizeFunc;
import gobject.GObjectLibrary.GClassInitFunc;
import gobject.GObjectLibrary.GInstanceInitFunc;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GTypeInfo:<br>
 * @class_size: Size of the class structure (required for interface, classed and instantiatable types).<br>
 * @base_init: Location of the base initialization function (optional).<br>
 * @base_finalize: Location of the base finalization function (optional).<br>
 * @class_init: Location of the class initialization function for<br>
 *  classed and instantiatable types. Location of the default vtable <br>
 *  inititalization function for interface types. (optional) This function <br>
 *  is used both to fill in virtual functions in the class or default vtable, <br>
 *  and to do type-specific setup such as registering signals and object<br>
 *  properties.<br>
 * @class_finalize: Location of the class finalization function for<br>
 *  classed and instantiatable types. Location fo the default vtable <br>
 *  finalization function for interface types. (optional)<br>
 * @class_data: User-supplied data passed to the class init/finalize functions.<br>
 * @instance_size: Size of the instance (object) structure (required for instantiatable types only).<br>
 * @n_preallocs: Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the <link linkend="glib-Memory-Slices">slice allocator</link> now.<br>
 * @instance_init: Location of the instance initialization function (optional, for instantiatable types only).<br>
 * @value_table: A #GTypeValueTable function table for generic handling of GValues of this type (usually only<br>
 *  useful for fundamental types).<br>
 * <br>
 * This structure is used to provide the type system with the information<br>
 * required to initialize and destruct (finalize) a type's class and<br>
 * its instances.<br>
 * The initialized structure is passed to the g_type_register_static() function<br>
 * (or is copied into the provided #GTypeInfo structure in the<br>
 * g_type_plugin_complete_type_info()). The type system will perform a deep<br>
 * copy of this structure, so its memory does not need to be persistent<br>
 * across invocation of g_type_register_static().<br>
 * <i>native declaration : glib-2.0/gobject/gtype.h:415</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GTypeInfo extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * interface types, classed types, instantiated types<br>
	 * C type : guint16
	 */
	@Field(0) 
	public short class_size() {
		return this.io.getShortField(this, 0);
	}
	/**
	 * interface types, classed types, instantiated types<br>
	 * C type : guint16
	 */
	@Field(0) 
	public GTypeInfo class_size(short class_size) {
		this.io.setShortField(this, 0, class_size);
		return this;
	}
	/** C type : GBaseInitFunc */
	@Field(1) 
	public Pointer<GBaseInitFunc > base_init() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : GBaseInitFunc */
	@Field(1) 
	public GTypeInfo base_init(Pointer<GBaseInitFunc > base_init) {
		this.io.setPointerField(this, 1, base_init);
		return this;
	}
	/** C type : GBaseFinalizeFunc */
	@Field(2) 
	public Pointer<GBaseFinalizeFunc > base_finalize() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : GBaseFinalizeFunc */
	@Field(2) 
	public GTypeInfo base_finalize(Pointer<GBaseFinalizeFunc > base_finalize) {
		this.io.setPointerField(this, 2, base_finalize);
		return this;
	}
	/**
	 * interface types, classed types, instantiated types<br>
	 * C type : GClassInitFunc
	 */
	@Field(3) 
	public Pointer<GClassInitFunc > class_init() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * interface types, classed types, instantiated types<br>
	 * C type : GClassInitFunc
	 */
	@Field(3) 
	public GTypeInfo class_init(Pointer<GClassInitFunc > class_init) {
		this.io.setPointerField(this, 3, class_init);
		return this;
	}
	/** C type : GClassFinalizeFunc */
	@Field(4) 
	public Pointer<GClassFinalizeFunc > class_finalize() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : GClassFinalizeFunc */
	@Field(4) 
	public GTypeInfo class_finalize(Pointer<GClassFinalizeFunc > class_finalize) {
		this.io.setPointerField(this, 4, class_finalize);
		return this;
	}
	/** C type : gconstpointer */
	@Field(5) 
	public Pointer<? > class_data() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : gconstpointer */
	@Field(5) 
	public GTypeInfo class_data(Pointer<? > class_data) {
		this.io.setPointerField(this, 5, class_data);
		return this;
	}
	/**
	 * instantiated types<br>
	 * C type : guint16
	 */
	@Field(6) 
	public short instance_size() {
		return this.io.getShortField(this, 6);
	}
	/**
	 * instantiated types<br>
	 * C type : guint16
	 */
	@Field(6) 
	public GTypeInfo instance_size(short instance_size) {
		this.io.setShortField(this, 6, instance_size);
		return this;
	}
	/** C type : guint16 */
	@Field(7) 
	public short n_preallocs() {
		return this.io.getShortField(this, 7);
	}
	/** C type : guint16 */
	@Field(7) 
	public GTypeInfo n_preallocs(short n_preallocs) {
		this.io.setShortField(this, 7, n_preallocs);
		return this;
	}
	/** C type : GInstanceInitFunc */
	@Field(8) 
	public Pointer<GInstanceInitFunc > instance_init() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : GInstanceInitFunc */
	@Field(8) 
	public GTypeInfo instance_init(Pointer<GInstanceInitFunc > instance_init) {
		this.io.setPointerField(this, 8, instance_init);
		return this;
	}
	/**
	 * value handling<br>
	 * C type : const GTypeValueTable*
	 */
	@Field(9) 
	public Pointer<GTypeValueTable > value_table() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * value handling<br>
	 * C type : const GTypeValueTable*
	 */
	@Field(9) 
	public GTypeInfo value_table(Pointer<GTypeValueTable > value_table) {
		this.io.setPointerField(this, 9, value_table);
		return this;
	}
	public GTypeInfo() {
		super();
	}
	public GTypeInfo(Pointer pointer) {
		super(pointer);
	}
}
