package collections;
import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> country = new HashMap();
		country.put("AP", "Andhra Pradesh");
		country.put("TS","Telengana");
		country.put("TN", "Tamilnadu");
		country.put("MH", "Maharastra");
		System.out.println(country);
		System.out.println(country.get("AP"));
		
		System.out.println(country.containsKey("KL"));
		System.out.println(country.containsValue("Maharast"));
		
		//country.remove("TS","Telengana");
		for(Map.Entry m : country.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		
		System.out.println(country.values());
		System.out.println(country.keySet());

	}
}
