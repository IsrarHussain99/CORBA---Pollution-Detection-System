package RMCentre;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "RMC".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public class RMCPOATie
	extends RMCPOA
{
	private RMCOperations _delegate;

	private POA _poa;
	public RMCPOATie(RMCOperations delegate)
	{
		_delegate = delegate;
	}
	public RMCPOATie(RMCOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public RMCOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RMCOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public boolean checkUser(java.lang.String userID)
	{
		return _delegate.checkUser(userID);
	}

	public LMCentre.AlarmClass currentAlarm(java.lang.String district, java.lang.String who)
	{
		return _delegate.currentAlarm(district,who);
	}

	public LMCentre.AlarmClass[] allCurrentAlarms(java.lang.String district, java.lang.String who)
	{
		return _delegate.allCurrentAlarms(district,who);
	}

	public void raiseAlarm(RMCentre.AlarmData anAlarm)
	{
_delegate.raiseAlarm(anAlarm);
	}

	public void registerAgency(java.lang.String who, java.lang.String contact_details, java.lang.String zone)
	{
_delegate.registerAgency(who,contact_details,zone);
	}

	public void registerUser(java.lang.String who, java.lang.String contact_details, java.lang.String zone)
	{
_delegate.registerUser(who,contact_details,zone);
	}

}
