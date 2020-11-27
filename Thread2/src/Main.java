class NameRunnable implements Runnable {
    public void run() {
           for (int x = 1; x <= 3; x++) {
                 System.out.println("Run by "+ Thread.currentThread().getName() + ", x is " + x);
//                     try {
//    					Thread.sleep(1000);
//    				   } catch (InterruptedException e) {
//    					e.printStackTrace();}
                }
       }
}
public class Main {
public static void main(String[] args) {
	Runnable r = new NameRunnable();
	Thread one = new Thread(r);
	Thread two = new Thread(r);
	Thread three = new Thread(r);

	one.setName("ziad");
	two.setName("hama");
	three.setName("nadia");
	
	one.start();
	two.start();
    three.start();
	
	
	
}
}
