package p3;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonArrayExample 
{
    public static void main(String[] args)
    {
    	ObjectMapper mapper = new ObjectMapper();
        String json = "[{\"name\":\"mkyong\", \"age\":37}, {\"name\":\"fong\", \"age\":38}]";

        try
        {

            // 1. convert JSON array to Array objects
            Person[] pp1 = mapper.readValue(json, Person[].class);
            System.out.println("JSON array to Array objects...");
            for (Person person : pp1) 
            {
                System.out.println(person);
            }

            // 2. convert JSON array to List of objects
            List<Person> ppl2 = Arrays.asList(mapper.readValue(json, Person[].class));
            System.out.println("\nJSON array to List of objects");
            ppl2.stream().forEach(x -> System.out.println(x));
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}