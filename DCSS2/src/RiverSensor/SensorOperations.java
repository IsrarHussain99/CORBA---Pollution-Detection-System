package RiverSensor;


/**
 * Generated from IDL interface "Sensor".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13-Apr-2020 20:24:29
 */

public interface SensorOperations
{
	/* constants */
	/* operations  */
	java.lang.String name();
	java.lang.String zone();
	RiverSensor.Reading current();
	void current(RiverSensor.Reading arg);
	RiverSensor.Reading currentReading();
	boolean power1();
	void power1(boolean arg);
	boolean power2();
	void power2(boolean arg);
}
