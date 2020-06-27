package RMCentre;

/**
 * Generated from IDL interface "RMC".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public final class RMCHolder	implements org.omg.CORBA.portable.Streamable{
	 public RMC value;
	public RMCHolder()
	{
	}
	public RMCHolder (final RMC initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RMCHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RMCHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RMCHelper.write (_out,value);
	}
}
