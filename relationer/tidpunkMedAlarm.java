package relationer;

import java.awt.Toolkit;

public class tidpunkMedAlarm extends tidpunkt2 {
	   private int at, am, as; 
	   private boolean ring = false; 

	   public void sättAlarm (int tim, int min, int sek) {
	     if ( tim>=0 && tim<24 && min>=0 && min<60 && sek>=0 && sek<60) {
	       at=tim; am=min; as=sek; ring = true;
	     }
	     else 
	       System.out.println("Felaktig tidpunkt");
	   }

	   public void stängAlarm() {
	     ring = false; 
	   }

	   @Override
	   public void ticka() {
	     super.ticka();
	     if (ring && avläsTim()==at && avläsMin()==am && avläsSek()==as) {
	       Toolkit.getDefaultToolkit().beep();
	     }
	   }
	 }