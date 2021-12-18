package JDBC.com;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MethodsDemo {
public static void main(String[] args) {
	Connection con=null;
	try {
		 con=getConnection();
		//add(con);
		//read(con);
		//update(con);
		deleteRecord(con);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			con.close();
			System.out.println("Connection closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public static Connection getConnection() throws SQLException
{
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Nishu@75079");
		System.out.println("Connection done Successfully");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}

public static void addRecord(Connection con) throws SQLException
{
if(con!=null)
{
	String sq="INSERT INTO student_info(roll_no,Name,Address)VALUES(2,'ABHI','Kolhapur')";
Statement stmt=con.createStatement();
stmt.executeUpdate(sq);
System.out.println("Insert values succesfully");
}
else
{
System.out.println("Connectin Failed");	
}
}

public static void readRecord(Connection con) throws SQLException
{
	if(con!=null)
	{	
	Statement st=con.createStatement();
	System.out.println("Read The required record");
	ResultSet rs=st.executeQuery("select * from student_info WHERE roll_no=10");
	rs.next();
	//while(rs.next())
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	else
	{
		System.out.println("Connection Failed");
	}
}

public static void updateTable(Connection con) throws SQLException
{
	if(con!=null)
	{
		String s="UPDATE student_info SET Name='Rohit' WHERE roll_no=10";
		Statement st=con.createStatement();
		st.executeUpdate(s);
		System.out.println("Record updated successfully");
	}
	else
	{
		System.out.println("Connection Failed");
	}
}
public static void deleteRecord(Connection con) throws SQLException
{
if(con!=null)
{
String s="DELETE FROM student_info WHERE roll_no=102";
Statement st=con.createStatement();
st.executeUpdate(s);

System.out.println("Record Deleted");
}
else
{
System.out.println("Connection Failed");	
}
}

}
