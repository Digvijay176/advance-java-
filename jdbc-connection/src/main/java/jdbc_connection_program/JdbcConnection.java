package jdbc_connection_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
	public static void main(String [] args) {
		try {
			String query ="create database jdbc_connection";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			
			Statement  stm = con.createStatement();
			stm.execute(query);
			
			
			System.out.print("database has been created!!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//five step to jdbc connection
//	1. load and register the driver
//	2. establish the connection
//	3. create the statement
//	4. execute the query 
//	5. close the connection