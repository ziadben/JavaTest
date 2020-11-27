class Pocket<T>{
	private T value;
    public Pocket(){}
	public Pocket(T value) {this.value=value;}
	public void set( T value ) { this.value = value; }
	public T get() {
		return value;
	}
	public boolean isEmpty() {return value==null;}
	public void empty() {
		value=null;
	}
}
class Player{
	public String name ;
	public Pocket<Long> rightPocket;
	public Pocket<Long> leftPocket;
	
}

public class Main {
public static void main(String[]args) {
	
	Player spieler1 = new Player();
	spieler1.name="ziad";
	spieler1.leftPocket = new Pocket(111111111111L);
	long aBigNumber = 2222222222222L;
	Pocket rPocket = new Pocket(aBigNumber);
    spieler1.rightPocket= rPocket;
    System.out.println(spieler1.name + " hat in den Taschen "+ spieler1.leftPocket.get()+" und " +spieler1.rightPocket.get());
    Long val1 =  spieler1.leftPocket.get();   // (2)
    Long val2 =  spieler1.rightPocket.get();
    System.out.println(val1.compareTo(val2) > 0 ? "linke Tasche hat die grösste Zahl":"rechte Tasche hat die grösste Zahl");
    
    
}
}
