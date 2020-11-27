
public class Product {
	String name;
	String description;
	double price;
	public Product ( String name, String desc, double price ) {
	this.name = name;
	this.description = desc;
	this.price = price;
	}
	public final double getPriceWithTax() {
	return price * 1.19;
	}
	public String toString() {
	return name + " _ " + description + " _ " + price + " EUR";
	}
}
 class Clothing extends Product {
	private int size;
	private String material;
	public Clothing(String name, String desc, double price, int size, String material) { 
		super(name, desc, price); 
		this.size = size; 
		this.material = material; }
	@Override 
	public String toString() {
		return super.toString()+" _ "+ size +" _ "+ material;
	}
	}
