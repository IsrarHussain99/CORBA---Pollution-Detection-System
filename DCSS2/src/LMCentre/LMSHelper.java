package LMCentre;


/**
 * Generated from IDL interface "LMS".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public abstract class LMSHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(LMSHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:LMCentre/LMS:1.0", "LMS");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final LMCentre.LMS s)
	{
			any.insert_Object(s);
	}
	public static LMCentre.LMS extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:LMCentre/LMS:1.0";
	}
	public static LMS read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(LMCentre._LMSStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final LMCentre.LMS s)
	{
		_out.write_Object(s);
	}
	public static LMCentre.LMS narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof LMCentre.LMS)
		{
			return (LMCentre.LMS)obj;
		}
		else if (obj._is_a("IDL:LMCentre/LMS:1.0"))
		{
			LMCentre._LMSStub stub;
			stub = new LMCentre._LMSStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static LMCentre.LMS unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof LMCentre.LMS)
		{
			return (LMCentre.LMS)obj;
		}
		else
		{
			LMCentre._LMSStub stub;
			stub = new LMCentre._LMSStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
