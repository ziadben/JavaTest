
import java.util.*;

public class MyStack {
   
	public static void main(String[] args) {
//	 Scanner input = new Scanner(System.in);
//	 String [] eingabe = new String[5];
//	 int i = 0;
//	 while(i<eingabe.length) {
//		 System.out.println("Name eingeben");
//		 eingabe[i++]= input.next();
//	 }
//	 System.out.println("Sie haben die Namen: ");
//	 for(String s: eingabe)
//		 System.out.println( s );
  
	 String[] elegalInput = {"ziad","nadia","hanibal","kamal","jamal"};
	 
	 loop:
	 while (true) {
		 String input1 = new Scanner(System.in).nextLine();
		 for(String s : elegalInput) 
			 if(s.equals(input1))  
	         break loop ;
		 }
	 System.out.println("gültiger Name eingegeben");
	 
//	 Stack<Integer> num = new Stack<Integer>();
//     num.push(3);
//     num.push(5);
//     num.push(11);
//     num.push(1);
//     num.push(17);
//     System.out.println(num.peek());
//     System.out.println(num);
//     num.pop();
//     System.out.println(num);
//     System.out.println(num.search(5));
//     System.out.println(num.search(17));
  
    
	}

}
