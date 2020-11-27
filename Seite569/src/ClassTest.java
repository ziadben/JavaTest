import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ClassTest {
       static int i;
	
	public static void main(String[] args) {
        String s;
//		String[]s1 = new String[30];
		String s2[] = null;
      try (BufferedReader br = new BufferedReader(new FileReader("dvdInfo.txt"))){
    	List<DVDInfo> dvdList = new ArrayList<DVDInfo>();
		   while((s=br.readLine())!=null) { 
           s2=s.split("\\/");
          String title = s2[0];
          String genre = s2[1];
          String leadActor=s2[2];
          DVDInfo dvdinfo = new DVDInfo(title, genre, leadActor);
          dvdList.add(dvdinfo);
//        System.out.println(s2[0]+"***"+s2[1]+"***"+s2[2]);
		
       }
		   System.out.println(dvdList);
   }catch(IOException e) {
	   System.err.println("Fehler beim lesen Der Datei");
	   e.printStackTrace();
	   }
      
    }
	
 }	
//	for(int y=0;y<i;y++) {
//		if(y!=0&y%3==0)
//			System.out.println();
//		System.out.print(s1[y]+" ");
//
//	}
