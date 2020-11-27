
public class CarThread extends Thread{
	 private String brand;
	 private String model;
	 private double price;
	 public CarThread ( String brand, String model) {
		 this.brand = brand;
		 this.model = model;
		 }
		 
		  public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

		public void run() {
			boolean flag = true;
		  while(flag) {
		  System.out.println("hello my name is this.brand");
		  
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			  e.printStackTrace();
		}finally {
			flag = false;
		}
		  }
		  }
	public static void main(String[] args) {
		new CarThread("Audi", "A3").run();
		 new CarThread("BMW","X5").run();
		 System.out.println("carThreads are running... ");

	}

}
