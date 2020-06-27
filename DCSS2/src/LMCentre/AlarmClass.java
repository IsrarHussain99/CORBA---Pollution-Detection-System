package LMCentre;

/**
 * Generated from IDL struct "AlarmClass".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public final class AlarmClass
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AlarmClass(){}
	public int the_time;
	public int the_date;
	public java.lang.String sensorString = "";
	public java.lang.String zoneString = "";
	public int sensor_level1;
	public int sensor_level2;
	public boolean isResolved;
	public int alarmID;
	public AlarmClass(int the_time, int the_date, java.lang.String sensorString, java.lang.String zoneString, int sensor_level1, int sensor_level2, boolean isResolved, int alarmID)
	{
		this.the_time = the_time;
		this.the_date = the_date;
		this.sensorString = sensorString;
		this.zoneString = zoneString;
		this.sensor_level1 = sensor_level1;
		this.sensor_level2 = sensor_level2;
		this.isResolved = isResolved;
		this.alarmID = alarmID;
	}
}
