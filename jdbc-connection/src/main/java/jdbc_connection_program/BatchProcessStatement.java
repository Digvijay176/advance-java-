package jdbc_connection_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	Statement st = con.createStatement();
	
	st.addBatch("insert into jdbc_connection.student values (8,'ram','ram@gmail.com',998877)");
	st.addBatch("insert into jdbc_connection.student values (9,'sham','sham@gmail.com',222)");
	st.addBatch("insert into jdbc_connection.student values (10,'kumar','kumar@gmail.com',332214)");
	int a[] =st.executeBatch();
	
	for(int i=0 ; i<a.length;i++) {
		System.out.println(a[i]);
	}
	}	
}
