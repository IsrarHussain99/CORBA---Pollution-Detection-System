package RMCentre;

/**
 * Generated from IDL struct "AlarmData".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public final class AlarmDataHolder
	implements org.omg.CORBA.portable.Streamable
{
	public RMCentre.AlarmData value;

	public AlarmDataHolder ()
	{
	}
	public AlarmDataHolder(final RMCentre.AlarmData initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RMCentre.AlarmDataHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = RMCentre.AlarmDataHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		RMCentre.AlarmDataHelper.write(_out, value);
	}
}
