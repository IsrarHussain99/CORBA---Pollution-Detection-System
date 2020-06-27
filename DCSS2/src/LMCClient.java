/**
 * A class to launch a LMCClient - Local Monitoring Centre Client.
 * Used to view all verified Alarms that have passed through a specified LMC.
 * Used to view all connected Sensors that are currently in a LMC.
 * Note - does not support removal of either alarms or connected sensors.
 * Some elements of the GUI were borrowed from the RelayGUI example provided on Unilearn.
 * @author - Kieron Tasker u1258496
 * 
 * Created as a part of my submission for the Distributed Client Server Systems CHS2546 module.
 */

import LMCentre.AlarmClass;
import LMCentre.LMS;
import org.omg.CORBA.ORB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;




/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class LMCClient extends JFrame {

	// the below button is used to get connected devices
	public JButton getConnected_Bttn;
	// id input for lmc
	public JTextField ID_LMCinput;
	//text
	private JTextArea TxtArea;
	//text panel
	public JPanel TxtPanel;
	private JButton getLMC_Bttn;
	//the button gets log
	private JButton getLog_Bttn;
	//scrollpane
    private JScrollPane Scroll;

    //STRING LIST
    public String LMC_ErrorMsg = "Error Processsing, - This LMC is not available (reconnect or try again)";
	public String ClientStarted_Msg = "\"Client started. Input a LMS name to view connected sensors or the Alarm log.\\n\\n\"";

    public LMCClient(String[] args) {
	try {
	    // set up the txtarea
	    TxtArea = new JTextArea(40,45);
	    //setup scrollpane
	    Scroll = new JScrollPane(TxtArea);
	    //setup textpanel
	    TxtPanel = new JPanel();
	    //setup textpanel with scroller
	    TxtPanel.add(Scroll);
	    //scroll bounds
	    Scroll.setBounds(15, 8, 380, 370);
	    {
	    	//Text field to input the name of a sensor to investigate.
	    	ID_LMCinput = new JTextField();
	    	//textpanel including lmc id
	    	TxtPanel.add(ID_LMCinput);
	    	//set text for id
	    	ID_LMCinput.setText("LMC ID...");
	    	// set bound for input size.
	    	ID_LMCinput.setBounds(18, 40, 120, 35);
	    }
	    {
	    	// setup getlog button
	    	getLog_Bttn = new JButton();
	    	// add getlog button to textpanel
	    	TxtPanel.add(getLog_Bttn);
	    	//getlog button set text as "get log"
	    	getLog_Bttn.setText("Get Log");
	    	// set bounds for button
	    	getLog_Bttn.setBounds(126, 363, 120, 23);
	    	//log bttn listener
	    	getLog_Bttn.addActionListener(new ActionListener() {

	    		public void actionPerformed(ActionEvent evt) {
	    			try{
	    				//get connected lmc
	    			LMS lms = getLMC(ID_LMCinput.getText().toString());
	    			TxtArea.setText("");
	    			//set text
	    			TxtArea.append("Found and Connected to the LMC - " + lms.name() + "\n");
	    			TxtArea.append("Showing the alarm log for LMS: \"" + lms.name() + "\".\n");
		    		//get the LMC alarm log (LMCServant.theLog();)
						//alarm log (array)
	    			AlarmClass[] alarmLog;
	    			//set alarmlog array to lms.thelog
						//gets the alarm logs from the lms log
	    			alarmLog = lms.theLog();
	    			TxtArea.append("---\n");
	    			//for loop (for the alarm log)
		    		for(int i = 0; i< alarmLog.length; i++){

		    			AlarmClass thisAlarm = alarmLog[i];
						//for each log the text will show date and time
		    			TxtArea.append("Alarm on date " + thisAlarm.the_date + " at time " + thisAlarm.the_time + "\n");
						//for each log the text will show the sensor the alarm was raised from.
		    			TxtArea.append("\"" + thisAlarm.sensorString + "\" triggered an alarm.\n");
		    			//
		    			TxtArea.append("Sensor 1 Air Pollution level: " + thisAlarm.sensor_level1 + " Sensor 2 Air Pollution level: " + thisAlarm.sensor_level2 + "\n");
		    			//TxtArea.append("Alarm sent to notification list? " + thisAlarm.isResolved);
		    			TxtArea.append("---\n");
		    		}
//"----------------------------------------------------------------------------------------------------------------------------------"\\IHUSSAIN
		    		TxtArea.append("LOG -- END.\n\n");

		    		// shows an error when an exception has occured
	    			} catch(Exception e){
	    				System.out.println(LMC_ErrorMsg);
	    			}
	    		}
	    	});
	    }
	    {	//button to retrieve all connected sensors to a specified LMC.
	    	getConnected_Bttn = new JButton();
	    	TxtPanel.add(getConnected_Bttn);
	    	//this button will show sensors available.
	    	getConnected_Bttn.setText("Show Available Sensors ");
	    	// set bpunds
	    	getConnected_Bttn.setBounds(126, 391, 157, 23);
	    	// action listener for get connected sensor button
	    	getConnected_Bttn.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent evt) {
	    			try{
	    				//get reference to specified LMC.
						// get lmc by id
	    			LMS lms = getLMC(ID_LMCinput.getText().toString());
	    			// set text
	    			TxtArea.setText("");
	    			//text 
	    			TxtArea.append("Connection to LMC " + lms.name() + " successful!\n");
	    			//text
	    			TxtArea.append("Showing all connected servers to this LMC: \"" + lms.name() + "\".\n");
		    		//get all connected sensors from this LMC.
						//show connected sensors via (Log_ConnectedSensors)
	    			String[] Log_ConnectedSensors = lms.linkedSensors();
	    			TxtArea.append("---\n");
		    		//go through Log_ConnectedSensors
						// and show data for each sensor.
	    			for(int i = 0; i< Log_ConnectedSensors.length; i++){

	    				// stirng which shows list of sensors in string format.
		    			String this_Sensor = Log_ConnectedSensors[i];
		    			TxtArea.append("\"" + this_Sensor + "\"\n");
		    		}
	    			TxtArea.append("---\n");
	    			TxtArea.append("---\n");
		    		TxtArea.append("lOG -- END.\n\n");
		    		} catch(Exception e){
		    			System.out.println(LMC_ErrorMsg);
		    		}
	    		}

	    	});
	    }

	    getContentPane().add(TxtPanel, "Center");
	    TxtPanel.setLayout(null);

	    setSize(400, 500);
            setTitle("LMC - Client");

            addWindowListener (new java.awt.event.WindowAdapter () {
                public void windowClosing (java.awt.event.WindowEvent evt) {
                    System.exit(0);;
                }
            } );

	    TxtArea.append(ClientStarted_Msg + "Enter a valid LMS name to view data");
	    //EXCEPTION IF LMS ERROR.
	} catch (Exception e) {
	    System.out.println("ERROR: LMS not found or error trying to connect" + e) ;
	    e.printStackTrace(System.out);
	}
    }


//----------------------------------------------------------------------------------------------------------------------------// IHUSSAIN  - NEEDS COMMENTS AND CHANGING CMNTS
    public static void main(String args[]) {
	final String[] arguments = args;
        java.awt.EventQueue.invokeLater(new Runnable() {
		public void run() {
		    new  LMCClient(arguments).setVisible(true);
		}
	    });
    }
    
    public LMS getLMC(String lmcID){
    	try{
	    // create and initialize the ORB
		String[] args = new String[0];
	    ORB orb = ORB.init(args, null);
	    
	    // read in the 'stringified IOR' of the Relay
        BufferedReader in = new BufferedReader(new FileReader("LMC_" + lmcID + ".ref"));
      	String stringified_ior = in.readLine();
	    
	    // get object reference from stringified IOR
      	org.omg.CORBA.Object server_ref = 		
		orb.string_to_object(stringified_ior);
	    
	    final LMS lms = 
		LMCentre.LMSHelper.narrow(server_ref);
	    return lms;

    	} catch(Exception e){
    		System.out.println("Selected sensor.ref file not found (or it has been deleted since this sensor started running.)");
    		TxtArea.append("Sensor not found!");
    	}
    	return null;
    
    }
}