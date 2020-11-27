import java.io.*;

class Collar {
	private int collarsize;
	public Collar(int csize) {
		collarsize = csize;
	}
	public int getcollar() {
		return collarsize;
	}
}
class Dog implements Serializable{
  private int dogSize;
  transient private Collar theCollar;
  public Dog(Collar collar,int size){
	 theCollar = collar;
	 dogSize = size;
	 }
  public Collar getCollar() { return theCollar; }
}

public class SerializeDog  {

	public static void main(String[] args) {
     Collar c = new Collar(4);
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
    	 System.out.println("after: collar size is "+ d.getCollar().getcollar());

	}

}
