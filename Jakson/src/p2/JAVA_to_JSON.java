package p2;

import java.io.StringWriter;
import org.codehaus.jackson.map.ObjectMapper;

public class JAVA_to_JSON 
{
	public static void main(String[] args) 
	{
        try 
        {
            Country_Bean obj_Country_Bean = new Country_Bean();
            obj_Country_Bean.setStatusCode("OK");
            obj_Country_Bean.setStatusMessage("jinu Testing JSON");
            obj_Country_Bean.setCountryName("INDIA");
            obj_Country_Bean.setIpAddress("2.2.2.2.2.2");
            obj_Country_Bean.setCountryCode("IN");
            obj_Country_Bean.setRegionName("Kerala");
            obj_Country_Bean.setCityName("Kerala City");
            obj_Country_Bean.setZipCode("9632874");
            obj_Country_Bean.setLatitude("11.3656155");
            obj_Country_Bean.setLongitude("52.3333");
            obj_Country_Bean.setTimeZone("test time zone");
            ObjectMapper objectMapper = new ObjectMapper();
            StringWriter stringEmp = new StringWriter();
            objectMapper.writeValue(stringEmp, obj_Country_Bean);
            System.out.println("Country JSON is\n" + stringEmp);
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
