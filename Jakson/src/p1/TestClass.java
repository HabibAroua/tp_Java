package p1;

import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class TestClass
{
	public static void main(String[] args) 
	{
		String inputJson="{  \"email\":\"abc@123.com\",  \"did_you_mean\":\"abc@me.com\",  \"user\":\"abc\",  \"domain\":\"123.com\",  \"format_valid\":true,  \"mx_found\":false,  \"smtp_check\":false,  \"catch_all\":null,  \"role\":false,  \"disposable\":false,  \"free\":true,  \"score\":0.16}";
		ObjectMapper mapper= new ObjectMapper();
		try 
		{
			MainParser mp= mapper.readValue(inputJson, MainParser.class);	
			System.out.println(mp.getScore());
			System.out.println(mp.getEmail());
		} 
		catch (JsonParseException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (JsonMappingException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
