package RMCentre;

/**
 * Generated from IDL alias "AllAlarmList".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public final class AllAlarmListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public LMCentre.AlarmClass[] value;

	public AllAlarmListHolder ()
	{
	}
	public AllAlarmListHolder (final LMCentre.AlarmClass[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AllAlarmListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AllAlarmListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AllAlarmListHelper.write (out,value);
	}
}
