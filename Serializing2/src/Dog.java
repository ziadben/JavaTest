import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Collar {
	private int collarsize;
	public Collar(int csize) {
		collarsize = csize;
	}
	public int getCollarSize() {
		return collarsize;
	}
}

public class Dog implements Serializable{
	transient private Collar theCollar;
	private int dogSize;
	public Dog(Collar collar, int size) {
	theCollar = collar;
	dogSize = size;
	}
	public Collar getCollar() { return theCollar; }
	private void writeObject(ObjectOutputStream os) {
		// throws IOException { // 1
		try {
		os.defaultWriteObject(); // 2
	    os.writeInt(theCollar.getCollarSize()); // 3
		} catch (Exception e) { e.printStackTrace(); }
		}
	
	private void readObject(ObjectInputStream is) {
		// throws IOException, ClassNotFoundException { // 4
		try {
		is.defaultReadObject(); // 5
		theCollar = new Collar(is.readInt()); // 6
		
		} catch (Exception e) { e.printStackTrace(); }
		}
}
 class SerializeDog  {

	public static void main(String[] args) {
		  Collar c = new Collar(5);
		  Dog d = new Dog(c, 20);
		  try {
		    	 FileOutputStream fs = new FileOutputStream("testSer.ser");
		    	 ObjectOutputStream os = new ObjectOutputStream(fs);
		    	 os.writeObject(d);
		    	 os.close();
		     }catch(Exception e) {
		    	 e.printStackTrace();
		     }try {
		    	 FileInputStream fis = new FileInputStream("testSer.ser");
		    	 ObjectInputStream ois = new ObjectInputStream(fis);
		    	 d = (Dog) ois.readObject();
		    	 ois.close();
		    	 } catch (Exception e) { 
		    		 e.printStackTrace(); 
		    	 }
		     System.out.println("after: collar size is " +d.getCollar().getCollarSize());  	

	}
	}
