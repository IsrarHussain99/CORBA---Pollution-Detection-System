package RiverSensor;

/**
 * Generated from IDL struct "Reading".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13-Apr-2020 20:24:29
 */

public final class ReadingHolder
	implements org.omg.CORBA.portable.Streamable
{
	public RiverSensor.Reading value;

	public ReadingHolder ()
	{
	}
	public ReadingHolder(final RiverSensor.Reading initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RiverSensor.ReadingHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = RiverSensor.ReadingHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		RiverSensor.ReadingHelper.write(_out, value);
	}
}
