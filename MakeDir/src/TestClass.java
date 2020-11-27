import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestClass {

	public static void main(String[] args) {
		Integer i1 = 1000;
		Integer i2 = 1000;
		if (i1==i2)
			System.out.println("sie sind gleich");
		if(i1.equals(i2))
			System.out.println("sie sind equal");
		File dir = new File("mydir");
		dir.mkdir();
		File file = new File(dir,"myfile");
		try {
			file.createNewFile();
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("HALLO ich bin Ziad hhhhbsgdathskkmns kksiuhsvfsgbs llisahhs4566");
		bw.flush();
		bw.close();
		
		String s;
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while((s=br.readLine())!=null)
			System.out.println(s);
		br.close();
		} catch (IOException e) {
			  e.printStackTrace();
		}
		

	}

}
