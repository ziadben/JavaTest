import java.util.Random;

public class VerticalThread extends Thread{
	public void run() {
		while(true) {
			makeVerticalmovement();
		}
	}
	private synchronized void makeVerticalmovement(){
	     System.out.print("ROBOT move ");
		  try {
			  if (new Random().nextBoolean()) { 
				  System.out.println("forward."); } 
			  else { 
				  System.out.println("backward."); }
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Vertical movement interrupted");
		}
    }
  
}
