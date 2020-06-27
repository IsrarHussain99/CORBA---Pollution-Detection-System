package RiverSensor;


/**
 * Generated from IDL interface "Sensor".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13-Apr-2020 20:24:29
 */

public abstract class SensorHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SensorHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:RiverSensor/Sensor:1.0", "Sensor");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final RiverSensor.Sensor s)
	{
			any.insert_Object(s);
	}
	public static RiverSensor.Sensor extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:RiverSensor/Sensor:1.0";
	}
	public static Sensor read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(RiverSensor._SensorStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final RiverSensor.Sensor s)
	{
		_out.write_Object(s);
	}
	public static RiverSensor.Sensor narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof RiverSensor.Sensor)
		{
			return (RiverSensor.Sensor)obj;
		}
		else if (obj._is_a("IDL:RiverSensor/Sensor:1.0"))
		{
			RiverSensor._SensorStub stub;
			stub = new RiverSensor._SensorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static RiverSensor.Sensor unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof RiverSensor.Sensor)
		{
			return (RiverSensor.Sensor)obj;
		}
		else
		{
			RiverSensor._SensorStub stub;
			stub = new RiverSensor._SensorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
