import java.util.Random;

public class Exercise_7 {
     public static char argumentAuswerten(boolean wert) {
    	if (wert )
    		return 'a';
    	else if (new Random().nextBoolean())
    		return 'b';
    	else 
    		return 'c';
    
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(argumentAuswerten(false));
		System.out.print(argumentAuswerten(true));
	}

}
