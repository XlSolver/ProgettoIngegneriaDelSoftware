
package it.unina.dao;
import java.sql.*;
import it.unina.bean.Libro;

public class LibroDAO {
	Libro createLibro(Libro libro) {
		return null;
	}
	Libro readLibro(Libro libro) {
		return null;
	}
	Libro updateLibro(Libro libro) {
		return null;
	}
	Libro deleteLibro(Libro libro) {
		return null;
	}
	
	public static void main(String[] args) throws Exception {
	        Connection conn = DriverManager. getConnection("jdbc:h2:~/test", "sa", "password");
	        // add application code here
	        Statement statement = conn.createStatement();
	        ResultSet r = statement.executeQuery("SELECT * FROM Libro");
	        while (r.next()) {
				System.out.println(r.getInt("idLibro"));
				System.out.println(r.getString("Titolo"));
				
			}
	        conn.close();
	  }

}
