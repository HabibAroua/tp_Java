package client;

public class Main 
{
	public static void main(String args[])
	{
		double version= 0.2;
		String url="http://localhost/post/test.php";
		
		String [] fields =
			{
					"username : bob;" ,
					"password : 123;",
					"email : habib.aroua@sesame.com.tn;",
					"purchase : plan1;"
			};
		
		ConnectionFactory connection =new ConnectionFactory(fields,url,version);
		connection.setUserAgent("Mozilla/4.0");
		String response = connection.buildConnection();
		System.out.println(response);
	}
}
