package JDBC.com;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JDBCUsingMethodsDemo {
public static void main(String[] args) {
	try {
		Connection con=getConnection();
		JDBCUsingMethodsDemo jdbc=new JDBCUsingMethodsDemo();
       List al= jdbc.fetchStudent(con);
     	System.out.println(al);
       
      System.out.println(deleteRecord(con));

	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}

public static Connection getConnection() throws SQLException
{
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Nishu@75079");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return con;
}


public static List fetchStudent(Connection con) throws SQLException
{
	Statement st=con.createStatement();
	String s="select * from student_info where address='pune'";
	ResultSet rs=st.executeQuery(s);
	List al=new ArrayList();
	while(rs.next())
	{
	  Student s1=new Student();
	  s1.setAddress(rs.getString(3));
	  s1.setRoll_no(rs.getInt(1));
	  s1.setName(rs.getString(2));
	  al.add(s1);	
	}
	return al;
}

public static boolean deleteRecord(Connection con) throws SQLException
{
	if(con!=null)
	{
		Statement st=con.createStatement();
		String s2="DELETE from student_info WHERE roll_no=1";
		st.executeUpdate(s2);	
		return true;
	}
	
	else
	{
		return false;
	}
}


}
