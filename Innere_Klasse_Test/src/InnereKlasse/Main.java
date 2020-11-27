package InnereKlasse;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Tier> tiere = new ArrayList<Tier>();
     tiere.add(new Hund());
     tiere.add(new Katze());
     tiere.add(new Katze());
     tiere.add(new Tier() {

		@Override
		public void macheDichBemerkbar() {
			System.out.println("ich bin ein unbekanntes Tier");
			}
	});
    
     for (Tier x : tiere) 
    	x.macheDichBemerkbar();
     
     System.out.println("<<<<<<<<>>>>>>>>>");
     
     for(int i=0;i< tiere.size();i++)
    	tiere.get(i).macheDichBemerkbar();
	}

}
