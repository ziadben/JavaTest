package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	 static public String ausgabe(String input) {
		  return input;
	      }
	static public void main(String[] args) {
	String src = "damage minor damages heavy damage no damages";
	//(\\bdamage\\b|minor damages|heavy damage)([^no damages]*)
	Pattern p = Pattern.compile("(\\bdamage\\b|minor damages|heavy damage)"); // the expression
	Matcher m = p.matcher(src); // the source
	while(m.find()) {

     System.out.println( ausgabe(m.group()) );

	}

	}
}

