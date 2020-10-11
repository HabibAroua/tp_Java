package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion
{
	public static Connection  connect()
	{  
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examen","root","");  
			return con;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}  
	}  
}