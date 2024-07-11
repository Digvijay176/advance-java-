package jdbc_connection_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessPrepareStatement {
	public static void main(String [] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		PreparedStatement psmt = con.prepareStatement("insert into jdbc_connection.student values (?,?,?,?)");
		
		psmt.setInt(1,11);
		psmt.setString(2,"tewari" );
		psmt.setString(3, "tewari@gmail.com");
		psmt.setInt(4,776633);
		psmt.addBatch();
		
		psmt.setInt(1,12);
		psmt.setString(2,"tewari" );
		psmt.setString(3, "tewi@gmail.com");
		psmt.setInt(4,33333333);
		psmt.addBatch();
		
		
		psmt.setInt(1,13);
		psmt.setString(2,"tewari" );
		psmt.setString(3, "teari@gmail.com");
		psmt.setInt(4,77663);
		psmt.addBatch();
		
		int []a = psmt.executeBatch();
		
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]);
		}
		
	}
}
