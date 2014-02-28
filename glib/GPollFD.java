package glib;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GPollFD:<br>
 * @fd: the file descriptor to poll (or a <type>HANDLE</type> on Win32)<br>
 * @events: a bitwise combination from #GIOCondition, specifying which<br>
 *     events should be polled for. Typically for reading from a file<br>
 *     descriptor you would use %G_IO_IN | %G_IO_HUP | %G_IO_ERR, and<br>
 *     for writing you would use %G_IO_OUT | %G_IO_ERR.<br>
 * @revents: a bitwise combination of flags from #GIOCondition, returned<br>
 *     from the poll() function to indicate which events occurred.<br>
 * * Represents a file descriptor, which events to poll for, and which events<br>
 * occurred.<br>
 * <i>native declaration : glib-2.0/glib/gpoll.h:56</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GLib") 
public class GPollFD extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : gint */
	@Field(0) 
	public int fd() {
		return this.io.getIntField(this, 0);
	}
	/** C type : gint */
	@Field(0) 
	public GPollFD fd(int fd) {
		this.io.setIntField(this, 0, fd);
		return this;
	}
	/** C type : gushort */
	@Field(1) 
	public short events() {
		return this.io.getShortField(this, 1);
	}
	/** C type : gushort */
	@Field(1) 
	public GPollFD events(short events) {
		this.io.setShortField(this, 1, events);
		return this;
	}
	/** C type : gushort */
	@Field(2) 
	public short revents() {
		return this.io.getShortField(this, 2);
	}
	/** C type : gushort */
	@Field(2) 
	public GPollFD revents(short revents) {
		this.io.setShortField(this, 2, revents);
		return this;
	}
	public GPollFD() {
		super();
	}
	public GPollFD(Pointer pointer) {
		super(pointer);
	}
}
