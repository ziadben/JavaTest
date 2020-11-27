import java.io.*;


public class Main {

	public static void main(String[] args) {
		File file = new File("versuch.txt");
		 
	try (Writer fw = new FileWriter(file)){
		fw.write("Hallo ich bin noch wach und fit");
		System.out.println("Datei erzeugt");
		fw.flush();
	} catch (IOException e) {
		System.out.println("Datei kann nicht erzeugt");
	}
	
	Reader fr =null;
	try {
		fr = new FileReader(file);
		char []cbuf= new char[31];
		int i ;
	    while ((i=fr.read(cbuf))>=0) {
	   System.out.println("Anzahl Zeichen: "+i);	
		System.out.println(cbuf);
		}
	}catch (IOException e) {
		
			
	}finally {
		try {
			if (fr!=null)
			fr.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	}

}
