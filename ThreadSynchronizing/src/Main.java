class Account {
private int balance = 50;
public int getBalance() {
return balance;
}
public void withdraw(int amount) {
balance = balance - amount;
}
}
public class Main {

	public static void main(String[] args) {

    Runnable r = new MyRunnable();
    Thread lucy = new Thread(r);
	Thread fred = new Thread(r);
      lucy.setName("Lucy");
      fred.setName("Fred");
      lucy.start();
      fred.start();
	}

}
