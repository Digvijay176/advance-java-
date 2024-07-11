package jdbc_connection_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String [] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement st = con.createStatement();
		
		ResultSet  rs =st.executeQuery("select * from jdbc_connection.student");
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			
		}
	}
}
