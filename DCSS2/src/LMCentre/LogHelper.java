package LMCentre;

/**
 * Generated from IDL alias "Log".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public abstract class LogHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, LMCentre.AlarmClass[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static LMCentre.AlarmClass[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(LogHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(LMCentre.LogHelper.id(), "Log",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(LMCentre.AlarmClassHelper.id(),"AlarmClass",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("the_time", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("the_date", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("sensorString", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("zoneString", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sensor_level1", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("sensor_level2", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("isResolved", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("alarmID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:LMCentre/Log:1.0";
	}
	public static LMCentre.AlarmClass[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		LMCentre.AlarmClass[] _result;
		int _l_result0 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result0 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result0);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new LMCentre.AlarmClass[_l_result0];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=LMCentre.AlarmClassHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, LMCentre.AlarmClass[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			LMCentre.AlarmClassHelper.write(_out,_s[i]);
		}

	}
}
