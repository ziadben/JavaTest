
public class Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HorizontalThread().start();
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.getStackTrace();
		}
		new VerticalThread().start();
	}

}
