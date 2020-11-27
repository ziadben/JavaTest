
public class Singleton {
	private static Singleton instance = null;
	   private Singleton() {
	      // Exists only to defeat instantiation.
	   }

	   public static Singleton getInstance() {
	      if(instance == null) {
	         instance = new Singleton();
	      }
	      return instance;
	   }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstance( );
	    
	}

}
