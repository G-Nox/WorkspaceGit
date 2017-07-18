package skills;

import java.util.Date;

/**
 *   
 *   @author 	Ludwig Kaftan
 *   @version 	Alpha 1.0
 *
 */
public class L_Herunterfahren {

	private Date timer;
	
	public L_Herunterfahren(){
		
		
	}
	
	/**
	 * 
	 * @since 	Alpha 1.0
	 * @return 	
	 * 
	 * @param sekunden
	 * 
	 */
	public void timerStart (int sekunden){
		try
        {
//            String cmdBefehl = "shutdown.exe -s -t" +sekunden+ "-c \"\"";
            String cmdBefehl = "shutdown.exe -s -t 0 -c \"\"";

            Runtime.getRuntime().exec("Chill down ;)"+cmdBefehl);
        }
//        catch(Exception Err)
        catch(Exception e)

        {
            System.err.println("Fehler beim Herunterfahren des Computers");
        }
//		profilePic = new ImageIcon(fbUserController.getActiveUser().getPathToAvatar());
//		profilePic.setImage(profilePic.getImage().getScaledInstance(100, 100, Image.SCALE_FAST));
	}
	
	/**
	 * 
	 * @since 	Alpha 1.0
	 * @return 	
	 * 
	 */
	public void abbrechen (){
		
	}
}
