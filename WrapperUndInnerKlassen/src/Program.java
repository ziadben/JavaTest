

class Outer{
	private int x = 14;
	public void zugriffAufInner() {
	Inner in = new Inner();
	System.out.println(in.y);
	}
class Inner{
	private int y = 2 ;
	public void zugriffOufOuter() {
	System.out.println(x);
	System.out.println(Outer.this.x);
		/* oder */	
	Outer out1 = new Outer();	
	System.out.println(out1.x);
	
	
	}
}
}
public class Program {
       
	public static void main(String[] args) {

		Outer out = new Outer();
	    Outer.Inner inn = out.new Inner();
		inn.zugriffOufOuter();
		out.zugriffAufInner();
		

	}

}
