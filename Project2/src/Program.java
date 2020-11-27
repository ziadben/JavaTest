import java.util.Arrays;

public class Program {
	
	public static void main(String[] args) {
        String test ="hallo";
        if( test!=null || !test.isEmpty() )
        	System.out.println("hallo");
        int[]array=new int[4];
        int i=0;
        for(int a:array) { 
        	a=i++;
        System.out.print(a);}
        
        System.out.println();
    	int[]array2=array.clone();
    	System.out.println(array2.length);
    	
 }
}
