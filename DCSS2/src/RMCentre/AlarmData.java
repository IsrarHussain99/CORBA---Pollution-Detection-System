package RMCentre;

/**
 * Generated from IDL struct "AlarmData".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public final class AlarmData
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AlarmData(){}
	public LMCentre.AlarmClass aReading;
	public java.lang.String aConfirmingSensor = "";
	public AlarmData(LMCentre.AlarmClass aReading, java.lang.String aConfirmingSensor)
	{
		this.aReading = aReading;
		this.aConfirmingSensor = aConfirmingSensor;
	}
}
