package LMCentre;

/**
 * Generated from IDL interface "LMS".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public final class LMSHolder	implements org.omg.CORBA.portable.Streamable{
	 public LMS value;
	public LMSHolder()
	{
	}
	public LMSHolder (final LMS initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LMSHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LMSHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LMSHelper.write (_out,value);
	}
}
