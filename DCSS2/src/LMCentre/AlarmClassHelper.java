package LMCentre;


/**
 * Generated from IDL struct "AlarmClass".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public abstract class AlarmClassHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(AlarmClassHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(LMCentre.AlarmClassHelper.id(),"AlarmClass",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("the_time", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("the_date", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("sensorString", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("zoneString", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sensor_level1", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("sensor_level2", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("isResolved", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("alarmID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final LMCentre.AlarmClass s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static LMCentre.AlarmClass extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:LMCentre/AlarmClass:1.0";
	}
	public static LMCentre.AlarmClass read (final org.omg.CORBA.portable.InputStream in)
	{
		LMCentre.AlarmClass result = new LMCentre.AlarmClass();
		result.the_time=in.read_long();
		result.the_date=in.read_long();
		result.sensorString=in.read_string();
		result.zoneString=in.read_string();
		result.sensor_level1=in.read_long();
		result.sensor_level2=in.read_long();
		result.isResolved=in.read_boolean();
		result.alarmID=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final LMCentre.AlarmClass s)
	{
		out.write_long(s.the_time);
		out.write_long(s.the_date);
		java.lang.String tmpResult0 = s.sensorString;
out.write_string( tmpResult0 );
		java.lang.String tmpResult1 = s.zoneString;
out.write_string( tmpResult1 );
		out.write_long(s.sensor_level1);
		out.write_long(s.sensor_level2);
		out.write_boolean(s.isResolved);
		out.write_long(s.alarmID);
	}
}
