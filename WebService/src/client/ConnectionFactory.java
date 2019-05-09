package client;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
public class ConnectionFactory
{
	private double API_VERSION = 0;
	private String API = "";
	
	private String METHOD = "POST";
	private String TYPE = "application/x-www-form-urlencoded";
	private String USER_AGENT = "Mozilla/5.0";
	private String data = "";
	private URL connection;
	private HttpURLConnection finalConnection;
	
	private HashMap<String,String> fields =new HashMap<String , String>();
	
	
}
