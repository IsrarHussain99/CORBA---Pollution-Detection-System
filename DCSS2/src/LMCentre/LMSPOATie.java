package LMCentre;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "LMS".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public class LMSPOATie
	extends LMSPOA
{
	private LMSOperations _delegate;

	private POA _poa;
	public LMSPOATie(LMSOperations delegate)
	{
		_delegate = delegate;
	}
	public LMSPOATie(LMSOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public LMSOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(LMSOperations delegate)
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
	public java.lang.String name()
	{
		return _delegate.name();
	}

	public void newSensor(RiverSensor.Sensor aSensor)
	{
_delegate.newSensor(aSensor);
	}

	public void linkedSensors(java.lang.String[] a)
	{
		_delegate.linkedSensors(a);
	}

	public void CallAlarm(LMCentre.AlarmClass aReading)
	{
_delegate.CallAlarm(aReading);
	}

	public java.lang.String[] linkedSensors()
	{
		return _delegate.linkedSensors();
	}

	public void theLog(LMCentre.AlarmClass[] a)
	{
		_delegate.theLog(a);
	}

	public LMCentre.AlarmClass[] theLog()
	{
		return _delegate.theLog();
	}

}
