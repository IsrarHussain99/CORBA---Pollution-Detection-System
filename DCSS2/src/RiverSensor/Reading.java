package RiverSensor;

/**
 * Generated from IDL struct "Reading".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13-Apr-2020 20:24:29
 */

public final class Reading
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Reading(){}
	public int time;
	public int date;
	public int level1;
	public int level2;
	public java.lang.String sensorName = "";
	public Reading(int time, int date, int level1, int level2, java.lang.String sensorName)
	{
		this.time = time;
		this.date = date;
		this.level1 = level1;
		this.level2 = level2;
		this.sensorName = sensorName;
	}
}
