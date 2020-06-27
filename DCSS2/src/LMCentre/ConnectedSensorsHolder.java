package LMCentre;

/**
 * Generated from IDL alias "ConnectedSensors".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public final class ConnectedSensorsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public ConnectedSensorsHolder ()
	{
	}
	public ConnectedSensorsHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConnectedSensorsHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConnectedSensorsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConnectedSensorsHelper.write (out,value);
	}
}
