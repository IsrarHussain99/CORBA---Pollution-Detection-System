package LMCentre;


/**
 * Generated from IDL interface "LMS".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public abstract class LMSPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, LMCentre.LMSOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "_get_name", Integer.valueOf(0));
		m_opsHash.put ( "newSensor", Integer.valueOf(1));
		m_opsHash.put ( "_set_linkedSensors", Integer.valueOf(2));
		m_opsHash.put ( "CallAlarm", Integer.valueOf(3));
		m_opsHash.put ( "_get_linkedSensors", Integer.valueOf(4));
		m_opsHash.put ( "_set_theLog", Integer.valueOf(5));
		m_opsHash.put ( "_get_theLog", Integer.valueOf(6));
	}
	private String[] ids = {"IDL:LMCentre/LMS:1.0"};
	public LMCentre.LMS _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		LMCentre.LMS __r = LMCentre.LMSHelper.narrow(__o);
		return __r;
	}
	public LMCentre.LMS _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		LMCentre.LMS __r = LMCentre.LMSHelper.narrow(__o);
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
			case 0: // _get_name
			{
			_out = handler.createReply();
			java.lang.String tmpResult3 = name();
_out.write_string( tmpResult3 );
				break;
			}
			case 1: // newSensor
			{
				RiverSensor.Sensor _arg0=RiverSensor.SensorHelper.read(_input);
				_out = handler.createReply();
				newSensor(_arg0);
				break;
			}
			case 2: // _set_linkedSensors
			{
			_out = handler.createReply();
			linkedSensors(LMCentre.ConnectedSensorsHelper.read(_input));
				break;
			}
			case 3: // CallAlarm
			{
				LMCentre.AlarmClass _arg0=LMCentre.AlarmClassHelper.read(_input);
				_out = handler.createReply();
				CallAlarm(_arg0);
				break;
			}
			case 4: // _get_linkedSensors
			{
			_out = handler.createReply();
			LMCentre.ConnectedSensorsHelper.write(_out,linkedSensors());
				break;
			}
			case 5: // _set_theLog
			{
			_out = handler.createReply();
			theLog(LMCentre.LogHelper.read(_input));
				break;
			}
			case 6: // _get_theLog
			{
			_out = handler.createReply();
			LMCentre.LogHelper.write(_out,theLog());
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
