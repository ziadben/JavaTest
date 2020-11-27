import java.io.*;

class DVDInfo {
String title;
String genre;
String leadActor;
DVDInfo(String t, String g, String a) {
	title = t; genre = g; leadActor = a;
	}
	public String toString() {
	return title + " " + genre + " " + leadActor + "\n";
	}
}


public class Main {

	public static void main(String[] args) {
		File f = new File("dvdinfo.txt");
		
	try {	
		FileWriter fw = new FileWriter(f);
		fw.write("Donnie Darko/sci-fi/Gyllenhall, Jake\nRaiders of the Lost Ark/action/Ford, Harrison\n"
				+ "2001/sci-fi/??\nCaddy Shack/comedy/Murray, Bill\nStar Wars/sci-fi/Ford, Harrison\n"
				+ "Lost in Translation/comedy/Murray, Bill\nPatriot Games/action/Ford, Harrison");
		fw.flush();
		fw.close();
		FileReader fr = new FileReader(f);
        char[]in=new char[(int)f.length()];
		fr.read(in);
        for(char c:in) {
		  System.out.print(c);
		}
		fr.close();
	}catch(IOException e) {
		e.printStackTrace();
	}

	}

}
