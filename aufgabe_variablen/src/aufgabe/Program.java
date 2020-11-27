package aufgabe;

public class Program {
	static int x = 11;
    public int y = 33;
    public void method(int x)
    {
    	Program t = new Program();
        this.x = 22;
        this.y = 44;
 
        System.out.println("Test.x: " + Program.x);//22
        System.out.println("t.x: " + t.x);//22
        System.out.println("t.y: " + t.y);// wichtig y==33
        System.out.println("x: " + x);// 5
        System.out.println("y: " + y);// 44
    }
	public static void main(String[] args) {
		Program t = new Program();
        t.method(5);
        System.out.println(t.y);//==> wichtig y==44
  
        int x ;
        for( x=0;x<5;x++) {
        	  
                   System.out.println(x);
               }
             System.out.println(x);
             
       }
    
	}


