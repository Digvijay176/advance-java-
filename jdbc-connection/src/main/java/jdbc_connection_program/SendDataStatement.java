package jdbc_connection_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SendDataStatement {
	public static void main(String [] args) throws ClassNotFoundException, SQLException {
		
		String q1 = "create database jdbc_connection";
		
		String table = "create table jdbc_connection.student ("
				+ "studentId INT PRIMARY KEY,"
				+ "name VARCHAR(20) NOT NULL,"
				+ "email VARCHAR(20) UNIQUE,"
				+ "contactNo INT UNIQUE)";
		
		String add = "insert into jdbc_connection.student values(1, 'digvijay', 'digvijay@gmail.com', 99221)";
				
		
		
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		
		//create statement
		Statement smt = con.createStatement();
		smt.execute(add);
		System.out.print("database created!!");
		smt.close();
	}
}
