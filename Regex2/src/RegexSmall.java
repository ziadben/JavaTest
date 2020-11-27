import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSmall {
	public static void main(String[]args) {
	Pattern p = Pattern.compile("[^a-fA-f]");// hier werden die Integer einzeln lokalisiert
	Matcher m = p.matcher("a12c3e456fB");
	while(m.find())
		System.out.print(m.start()+" ");
	
System.out.println();

    Pattern p1 = Pattern.compile("[a-fA-f]");
	Matcher m1 = p1.matcher("a12c3e456fB");
	while(m1.find())
		System.out.print(m1.start()+" ");
	
System.out.println();

    Pattern p2 = Pattern.compile("\\d+");// hier das gegenteil von der Zeile 6 wegen + plus heisst 1 oder mehr
    Matcher m2 = p2.matcher("a12c3e456fB");
    while(m2.find())
	System.out.println(m2.start()+" ");

System.out.println();

    Pattern p3 = Pattern.compile("proj1([^,])*");//give me zero or more characters that aren't a comma.
	Matcher m3 = p3.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java");
	while(m3.find())
		System.out.print(m3.start()+" " );
	
System.out.println();
    Pattern p4 = Pattern.compile("\\d\\d\\d([-\\s])?\\d\\d\\d\\d");//entweder es gibt ein ( - )oder ein leerTaste oder es gibt nichts dazwichen 
    Matcher m4 = p4.matcher("017-6506");
	while(m4.find())
		System.out.println(m4.start()+" " );
	
System.out.println("---");
Pattern p5 = Pattern.compile("\\d*");
Matcher m5 = p5.matcher("ab345ef");
while(m5.find())
	System.out.println(m5.start()+"###"+m5.group());
System.out.println();
//    Pattern p5 = Pattern.compile("yyxxxyxx");
//	Matcher m5 = p5.matcher("\\.*xx");
//    while(m5.find())
//		System.out.print(m5.start()+" ");
    
    String s = "ab,cd5b,6x,z4";
    String []s1= s.split("\\d");
    for(String string : s1)
    	System.out.println(string);
    System.out.println("---");
    String []s2= s.split(",");
    for(String string : s2)
    	System.out.println(string);
    System.out.println("---");
    String []s3= s.split("([^,])*");
    for(String string : s3)
    	System.out.println(string);
	}

}
