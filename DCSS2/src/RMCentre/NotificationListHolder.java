package RMCentre;

/**
 * Generated from IDL alias "NotificationList".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public final class NotificationListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public NotificationListHolder ()
	{
	}
	public NotificationListHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NotificationListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NotificationListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NotificationListHelper.write (out,value);
	}
}
