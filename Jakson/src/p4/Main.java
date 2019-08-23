package p4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

public class Main 
{
	public static void main(String[] args)
	{
		try
        {
			List<User>users=convert_json_to_java();
			System.out.println("New show");
			for(int i=0; i<users.size() ; i++)
			{
				System.out.println(users.get(i));
			}
		} 
		catch (Exception e) 
		{
            System.out.println(e.getMessage());
        }
	}
	
	public static List<User> convert_json_to_java() throws Exception 
    {
    	ObjectMapper mapper = new ObjectMapper();
		try
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
	        List<User> users = Arrays.asList(mapper.readValue(response.toString(), User[].class));
            System.out.println("\nJSON array to List of objects");
            users.stream().forEach(x -> System.out.println(x.getFirstname()+" "+x.getLastname()+"\n"));
            return users;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			return null;
		}
    }
	
}
