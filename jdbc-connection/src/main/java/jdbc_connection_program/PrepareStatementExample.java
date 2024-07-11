package jdbc_connection_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatementExample {
	
	public static void main(String [] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		PreparedStatement psmt = con.prepareStatement("insert into jdbc_connection.student values(?,?,?,?)");
		psmt.setInt(1, 6);
		psmt.setString(2, "digvijay jadhav");
		psmt.setString(3, "jadhav@gmail.com");
		psmt.setInt(4, 22113344);
		psmt.execute();
		System.out.print("added successfully!");
	}
}
