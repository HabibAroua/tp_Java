package p3;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class JacksonListToJson
{
	public static void main(String[] args) throws JsonProcessingException 
	{
	      ObjectMapper mapper = new ObjectMapper();
	      mapper.enable(SerializationFeature.INDENT_OUTPUT);

	      List<String> books = new ArrayList<>();
	      books.add("Head First Java");
	      books.add("Thinking in Java");
	      books.add("Java: A Beginner's Guide");

	      String json = mapper.writeValueAsString(books);
	      System.out.println(json);
	}
}
