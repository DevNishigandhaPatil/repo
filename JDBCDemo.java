package JDBC.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
public static void main(String[] args) {
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Nishu@75079");
		System.out.println("Connection done  successfully");
	
		Statement stmt=con.createStatement();
//		String sql="INSERT INTO student_info (roll_no,Name,Address)VALUES(102,'ABC','PQR')";
//	    stmt.executeUpdate(sql);
	
		ResultSet rs=stmt.executeQuery("select * from student_info");
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			con.close();
			System.out.println("Connection closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
}
