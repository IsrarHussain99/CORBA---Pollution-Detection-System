package RMCentre;


/**
 * Generated from IDL interface "RMC".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 26-Apr-2020 19:49:18
 */

public interface RMCOperations
{
	/* constants */
	/* operations  */
	void raiseAlarm(RMCentre.AlarmData anAlarm);
	void registerAgency(java.lang.String who, java.lang.String contact_details, java.lang.String zone);
	void registerUser(java.lang.String who, java.lang.String contact_details, java.lang.String zone);
	LMCentre.AlarmClass currentAlarm(java.lang.String district, java.lang.String who);
	LMCentre.AlarmClass[] allCurrentAlarms(java.lang.String district, java.lang.String who);
	boolean checkUser(java.lang.String userID);
}
