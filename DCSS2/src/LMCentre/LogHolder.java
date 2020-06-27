package LMCentre;

/**
 * Generated from IDL alias "Log".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public final class LogHolder
	implements org.omg.CORBA.portable.Streamable
{
	public LMCentre.AlarmClass[] value;

	public LogHolder ()
	{
	}
	public LogHolder (final LMCentre.AlarmClass[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LogHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LogHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LogHelper.write (out,value);
	}
}
