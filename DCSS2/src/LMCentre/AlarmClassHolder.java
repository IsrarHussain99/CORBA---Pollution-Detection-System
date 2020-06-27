package LMCentre;

/**
 * Generated from IDL struct "AlarmClass".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public final class AlarmClassHolder
	implements org.omg.CORBA.portable.Streamable
{
	public LMCentre.AlarmClass value;

	public AlarmClassHolder ()
	{
	}
	public AlarmClassHolder(final LMCentre.AlarmClass initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LMCentre.AlarmClassHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = LMCentre.AlarmClassHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		LMCentre.AlarmClassHelper.write(_out, value);
	}
}
