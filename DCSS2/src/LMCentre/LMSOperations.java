package LMCentre;


/**
 * Generated from IDL interface "LMS".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public interface LMSOperations
{
	/* constants */
	/* operations  */
	java.lang.String name();
	LMCentre.AlarmClass[] theLog();
	void theLog(LMCentre.AlarmClass[] arg);
	java.lang.String[] linkedSensors();
	void linkedSensors(java.lang.String[] arg);
	void CallAlarm(LMCentre.AlarmClass aReading);
	void newSensor(RiverSensor.Sensor aSensor);
}
