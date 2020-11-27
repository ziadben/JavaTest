import java.util.Random;

public class HorizontalThread extends Thread {
	public void run() {
		while(true) {
			makeHorizontamovement();
		  }
	 }		
			
			
			private synchronized void makeHorizontamovement(){    
			System.out.print("ROBOT move to the ");
		     if (new Random().nextBoolean()) { 
				  System.out.println("right."); } 
			  else { 
				  System.out.println("left."); }
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Horizontal movement interrupted");
		}
     } 

}