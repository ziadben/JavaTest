
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class TestClass {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Berlin", "root", "1980Ziad#");
	myStmt = myConn.createStatement();
	myRs = myStmt.executeQuery("select actor_id , first_name, last_name from sakila.actor where actor_id =3");
	
	while(myRs.next()) {
    int id = myRs.getInt("actor_id");
	String fname = myRs.getString("first_name");
	String lname = myRs.getString("last_name");
	System.out.println("ID: " +id+ "\n" +"Vorname: "+fname+ "\n"+"Nachname: "+lname);
	}
	
	String sql = "INSERT INTO sakila.actor(actor_id,first_name,last_name) VALUES ('202','ziad', 'ben')";
	myStmt.executeUpdate(sql);
}catch (Exception exc) {
	exc.printStackTrace();
}
finally {
	if (myRs != null) {
		myRs.close();
	}
	
	if (myStmt != null) {
		myStmt.close();
	}
	
	if (myConn != null) {
		myConn.close();
}
	}

	}
}
