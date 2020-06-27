package RMCentre;


/**
 * Generated from IDL struct "AlarmData".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public abstract class AlarmDataHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(AlarmDataHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(RMCentre.AlarmDataHelper.id(),"AlarmData",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("aReading", org.omg.CORBA.ORB.init().create_struct_tc(LMCentre.AlarmClassHelper.id(),"AlarmClass",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("the_time", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("the_date", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("sensorString", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("zoneString", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sensor_level1", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("sensor_level2", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("isResolved", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("alarmID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)}), null),new org.omg.CORBA.StructMember("aConfirmingSensor", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final RMCentre.AlarmData s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static RMCentre.AlarmData extract (final org.omg.CORBA.Any any)
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
		return "IDL:RMCentre/AlarmData:1.0";
	}
	public static RMCentre.AlarmData read (final org.omg.CORBA.portable.InputStream in)
	{
		RMCentre.AlarmData result = new RMCentre.AlarmData();
		result.aReading=LMCentre.AlarmClassHelper.read(in);
		result.aConfirmingSensor=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final RMCentre.AlarmData s)
	{
		LMCentre.AlarmClassHelper.write(out,s.aReading);
		java.lang.String tmpResult5 = s.aConfirmingSensor;
out.write_string( tmpResult5 );
	}
}
