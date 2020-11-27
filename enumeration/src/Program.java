enum Day{
	SUNDAY("Frei"), MONDAY("Erster Tag"), TUESDAY("Zweiter Tag"), WEDNESDAY("Dritter Tag"),
    THURSDAY("Vierter Tag"), FRIDAY("Gebetstag"), SATURDAY("Shopping Tag");
	private Day(String s){
		this.action = s;
		System.out.println("Constructor called for : " +this.toString());
	}
	 public String getAction()
	    {
	        return this.action;
	    }
	 private String action;
}
public class Program {

	public static void main(String[] args) {

	  Day d= Day.MONDAY;
	  System.out.println(d);
	  Day[]arr= Day.values();
		for(Day t:arr) {
			System.out.println("name:"+t.name()+" Beschreibung:"+t.getAction());
		}
	}

}
