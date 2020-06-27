package RiverSensor;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Sensor".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13-Apr-2020 20:24:29
 */

public class SensorPOATie
	extends SensorPOA
{
	private SensorOperations _delegate;

	private POA _poa;
	public SensorPOATie(SensorOperations delegate)
	{
		_delegate = delegate;
	}
	public SensorPOATie(SensorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public SensorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SensorOperations delegate)
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
	public void power2(boolean a)
	{
		_delegate.power2(a);
	}

	public boolean power1()
	{
		return _delegate.power1();
	}

	public RiverSensor.Reading currentReading()
	{
		return _delegate.currentReading();
	}

	public java.lang.String name()
	{
		return _delegate.name();
	}

	public java.lang.String zone()
	{
		return _delegate.zone();
	}

	public boolean power2()
	{
		return _delegate.power2();
	}

	public void current(RiverSensor.Reading a)
	{
		_delegate.current(a);
	}

	public void power1(boolean a)
	{
		_delegate.power1(a);
	}

	public RiverSensor.Reading current()
	{
		return _delegate.current();
	}

}
