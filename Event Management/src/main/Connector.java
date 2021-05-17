package main;
import java.sql.*;
public class Connector {
    
   
	public static Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ankita","ankita","ankita");
			
			return con;
		}
		catch(Exception e)
		{
			System.out.println("error "+e);
		}
		return null;
		
		

	 }

}
