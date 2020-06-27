package RMCentre;


/**
 * Generated from IDL interface "RMC".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public abstract class RMCHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(RMCHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:RMCentre/RMC:1.0", "RMC");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final RMCentre.RMC s)
	{
			any.insert_Object(s);
	}
	public static RMCentre.RMC extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:RMCentre/RMC:1.0";
	}
	public static RMC read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(RMCentre._RMCStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final RMCentre.RMC s)
	{
		_out.write_Object(s);
	}
	public static RMCentre.RMC narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof RMCentre.RMC)
		{
			return (RMCentre.RMC)obj;
		}
		else if (obj._is_a("IDL:RMCentre/RMC:1.0"))
		{
			RMCentre._RMCStub stub;
			stub = new RMCentre._RMCStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static RMCentre.RMC unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof RMCentre.RMC)
		{
			return (RMCentre.RMC)obj;
		}
		else
		{
			RMCentre._RMCStub stub;
			stub = new RMCentre._RMCStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
