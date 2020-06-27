package LMCentre;

/**
 * Generated from IDL alias "logCount".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 18:24:18
 */

public abstract class logCountHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, int s)
	{
		any.insert_long(s);
	}

	public static int extract (final org.omg.CORBA.Any any)
	{
		return any.extract_long();
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(logCountHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(LMCentre.logCountHelper.id(), "logCount",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:LMCentre/logCount:1.0";
	}
	public static int read (final org.omg.CORBA.portable.InputStream _in)
	{
		int _result;
		_result=_in.read_long();
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, int _s)
	{
		_out.write_long(_s);
	}
}
