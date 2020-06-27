package RMCentre;


/**
 * Generated from IDL interface "RMC".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public abstract class RMCPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, RMCentre.RMCOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "checkUser", Integer.valueOf(0));
		m_opsHash.put ( "currentAlarm", Integer.valueOf(1));
		m_opsHash.put ( "allCurrentAlarms", Integer.valueOf(2));
		m_opsHash.put ( "raiseAlarm", Integer.valueOf(3));
		m_opsHash.put ( "registerAgency", Integer.valueOf(4));
		m_opsHash.put ( "registerUser", Integer.valueOf(5));
	}
	private String[] ids = {"IDL:RMCentre/RMC:1.0"};
	public RMCentre.RMC _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		RMCentre.RMC __r = RMCentre.RMCHelper.narrow(__o);
		return __r;
	}
	public RMCentre.RMC _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		RMCentre.RMC __r = RMCentre.RMCHelper.narrow(__o);
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
			case 0: // checkUser
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				_out.write_boolean(checkUser(_arg0));
				break;
			}
			case 1: // currentAlarm
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				LMCentre.AlarmClassHelper.write(_out,currentAlarm(_arg0,_arg1));
				break;
			}
			case 2: // allCurrentAlarms
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				RMCentre.AllAlarmListHelper.write(_out,allCurrentAlarms(_arg0,_arg1));
				break;
			}
			case 3: // raiseAlarm
			{
				RMCentre.AlarmData _arg0=RMCentre.AlarmDataHelper.read(_input);
				_out = handler.createReply();
				raiseAlarm(_arg0);
				break;
			}
			case 4: // registerAgency
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				registerAgency(_arg0,_arg1,_arg2);
				break;
			}
			case 5: // registerUser
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				registerUser(_arg0,_arg1,_arg2);
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
