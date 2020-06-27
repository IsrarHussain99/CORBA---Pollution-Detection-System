package RiverSensor;


/**
 * Generated from IDL interface "Sensor".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13-Apr-2020 20:24:29
 */

public abstract class SensorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, RiverSensor.SensorOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "_set_power2", Integer.valueOf(0));
		m_opsHash.put ( "_get_power1", Integer.valueOf(1));
		m_opsHash.put ( "currentReading", Integer.valueOf(2));
		m_opsHash.put ( "_get_name", Integer.valueOf(3));
		m_opsHash.put ( "_get_zone", Integer.valueOf(4));
		m_opsHash.put ( "_get_power2", Integer.valueOf(5));
		m_opsHash.put ( "_set_current", Integer.valueOf(6));
		m_opsHash.put ( "_set_power1", Integer.valueOf(7));
		m_opsHash.put ( "_get_current", Integer.valueOf(8));
	}
	private String[] ids = {"IDL:RiverSensor/Sensor:1.0"};
	public RiverSensor.Sensor _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		RiverSensor.Sensor __r = RiverSensor.SensorHelper.narrow(__o);
		return __r;
	}
	public RiverSensor.Sensor _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		RiverSensor.Sensor __r = RiverSensor.SensorHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // _set_power2
			{
			_out = handler.createReply();
			power2(_input.read_boolean());
				break;
			}
			case 1: // _get_power1
			{
			_out = handler.createReply();
			_out.write_boolean(power1());
				break;
			}
			case 2: // currentReading
			{
				_out = handler.createReply();
				RiverSensor.ReadingHelper.write(_out,currentReading());
				break;
			}
			case 3: // _get_name
			{
			_out = handler.createReply();
			java.lang.String tmpResult1 = name();
_out.write_string( tmpResult1 );
				break;
			}
			case 4: // _get_zone
			{
			_out = handler.createReply();
			java.lang.String tmpResult2 = zone();
_out.write_string( tmpResult2 );
				break;
			}
			case 5: // _get_power2
			{
			_out = handler.createReply();
			_out.write_boolean(power2());
				break;
			}
			case 6: // _set_current
			{
			_out = handler.createReply();
			current(RiverSensor.ReadingHelper.read(_input));
				break;
			}
			case 7: // _set_power1
			{
			_out = handler.createReply();
			power1(_input.read_boolean());
				break;
			}
			case 8: // _get_current
			{
			_out = handler.createReply();
			RiverSensor.ReadingHelper.write(_out,current());
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
