package p4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main 
{
	public static void main(String[] args)
	{
		try
        {
			System.out.println("Hello world");
			convert_json_to_java();
		} 
		catch (Exception e) 
		{
            System.out.println(e.getMessage());
        }
	}
	
	public static void convert_json_to_java() throws Exception 
    {
        String url = "http://192.168.1.8/post/users.php";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        
        while ((inputLine = in .readLine()) != null) 
        {
            response.append(inputLine);
        }
        
        in .close();
        System.out.println(response.toString());
    }
}
