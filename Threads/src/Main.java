import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Mythread mythread = new Mythread();
		System.out.println(mythread.getState());
		//mythread.setDaemon(true);user oder Daemon thread
		mythread.start();
		System.out.println("Enter anything: ");
		String in = input.next();
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			 e.printStackTrace();
		}
		System.out.println("bye");
	}

}
