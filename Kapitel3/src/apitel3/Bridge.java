package apitel3;

public class Bridge {
	
	public enum Suits {
		CLUBS(20), DIAMONDS(20), HEARTS(30), SPADES(30),
		NOTRUMP(40) { public int getValue(int bid) {
		return ((bid-1)*30)+40; } };
		Suits(int points) { this.points = points; }
		private int points;
		public int getValue(int bid) { return points * bid; }
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Suits.NOTRUMP.getValue(3));
		 System.out.println(Suits.SPADES + "=" + Suits.SPADES.points);
		 System.out.println(Suits.DIAMONDS.getValue(3));
		 System.out.println(Suits.values());
		 System.out.println( "Das ist eine normale Ausgabe" );
		 System.err.println( "Das ist eine Fehlerausgabe" );
		 

	}

}
