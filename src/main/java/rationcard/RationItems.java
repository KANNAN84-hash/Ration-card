package rationcard;

import java.util.HashMap;


public class RationItems {
	static HashMap<String,String> products=new HashMap<String,String>();
	 static 
	
	{
		
		products.put("wheat", "5 kg");
		products.put("rice", "10 kg");
		products.put("palm oil", "2 lit");
	}
	 
	public static String weight(String name) {
		return products.get(name);
	}
	public static void update(String name1,String name2)
	{
		products.put(name1,name2);
		
	}
}
