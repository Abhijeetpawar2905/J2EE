
import java.util.*;
import java.sql.*;

public class Q1 {
	
	public static void main(String [] args)
	{
		String ss= "jdbc:mysql://localhost:3306/bit";
		try(Connection con = DriverManager.getConnection(ss,"root","Asus@1234")){
		PreparedStatement pst= con.prepareStatement("insert into student(rollno,name,age) values(? ,?,?)");
		
		pst.setInt(1,1);
		pst.setString(2,"Appa");
		pst.setInt(3,2);
		
		int val =pst.executeUpdate();
		if(val>0)
			System.out
		}
	}

	
}
