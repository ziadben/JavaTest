import java.util.LinkedList;
import java.util.List;

class MyThis{
	private int a;

	  public MyThis() {
	    this(42); // calls the other constructor
	  }

	  public MyThis(int a) {
	    this.a = a; // assigns the value of the parameter a to the field of the same name
	  }

	  public void frobnicate() {
	    int a = 1;

	    System.out.println(a); // refers to the local variable a
	    System.out.println(this.a); // refers to the field a
	    System.out.println(this); // refers to this entire object
	    System.out.println(new MyThis());
	  }

	  public String toString() {
	    return "MyThisTest a=" + a; // refers to the field a
	  }
	}	

public class MyThisTest {

	public static void main(String[] args) {
    MyThis mt = new MyThis();
    mt.frobnicate();
  

	}

}
