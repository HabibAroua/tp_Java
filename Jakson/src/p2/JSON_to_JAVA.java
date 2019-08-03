package p2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.codehaus.jackson.map.ObjectMapper;

public class JSON_to_JAVA 
{
	public static void main(String[] args) {
        try {
            JSON_to_JAVA.convert_json_to_java();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
	
    public static void convert_json_to_java() throws Exception 
    {
        String ip = "37.210.57.113";
        String key = "9d64fcfdfacc213c7ddf4ef911dfe97b55e4696be546x532bf8302876c09ebad06b";
        String url = "http://api.ipinfodb.com/v3/ip-city/?key=" + key + "&ip=" + ip + "&format=json";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        
        while ((inputLine = in .readLine()) != null) 
        {
            response.append(inputLine);
        }
        
        in .close();
        System.out.println(response.toString());
        ObjectMapper obj_ObjectMapper = new ObjectMapper();
        Country_Bean obj_Country_Bean = new Country_Bean();
        obj_Country_Bean = obj_ObjectMapper.readValue(response.toString(), Country_Bean.class);
        System.out.println("-------Afer converting to java object-------------------");
        System.out.println("statusCode-" + obj_Country_Bean.getStatusCode());
        System.out.println("statusMessage-" + obj_Country_Bean.getStatusMessage());
        System.out.println("ipAddress-" + obj_Country_Bean.getIpAddress());
        System.out.println("countryCode-" + obj_Country_Bean.getCountryCode());
        System.out.println("countryName-" + obj_Country_Bean.getCountryName());
        System.out.println("regionName-" + obj_Country_Bean.getRegionName());
        System.out.println("cityName-" + obj_Country_Bean.getCityName());
        System.out.println("zipCode-" + obj_Country_Bean.getZipCode());
        System.out.println("latitude-" + obj_Country_Bean.getLatitude());
        System.out.println("longitude-" + obj_Country_Bean.getLongitude());
        System.out.println("timeZone-" + obj_Country_Bean.getTimeZone());
    }
}
