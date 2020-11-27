
public class Mythread extends Thread{

    public void run() {
    while(true) {
	  System.out.println("2nd Thread");
	  try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  } }
}
