package RiverSensor;


/**
 * Generated from IDL struct "Reading".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13-Apr-2020 20:24:29
 */

public abstract class ReadingHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ReadingHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(RiverSensor.ReadingHelper.id(),"Reading",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("time", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("date", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("level1", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("level2", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("sensorName", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final RiverSensor.Reading s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static RiverSensor.Reading extract (final org.omg.CORBA.Any any)
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
		return "IDL:RiverSensor/Reading:1.0";
	}
	public static RiverSensor.Reading read (final org.omg.CORBA.portable.InputStream in)
	{
		RiverSensor.Reading result = new RiverSensor.Reading();
		result.time=in.read_long();
		result.date=in.read_long();
		result.level1=in.read_long();
		result.level2=in.read_long();
		result.sensorName=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final RiverSensor.Reading s)
	{
		out.write_long(s.time);
		out.write_long(s.date);
		out.write_long(s.level1);
		out.write_long(s.level2);
		java.lang.String tmpResult0 = s.sensorName;
out.write_string( tmpResult0 );
	}
}
