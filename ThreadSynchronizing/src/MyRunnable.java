
public class MyRunnable implements Runnable {
     private Account account = new Account();
        public void run() {
		for(int x =0; x<5 ;x++) {
		    makeWithdrawal();
			}
        }
	private synchronized void makeWithdrawal(){
		if (account.getBalance()>=10) {
			System.out.println(" enought balance "+Thread.currentThread().getName() +" is going to withdraw");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			        e.printStackTrace();}
			account.withdraw(10);
			
		}
		else 
			System.out.println("Not enough in account for "+ Thread.currentThread().getName()+ " to withdraw " + account.getBalance());
		}    
  
}
