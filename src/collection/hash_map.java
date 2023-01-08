package collection;

import java.util.HashMap;
import java.util.Map;

public class hash_map {

	public static void main(String[] args) {
		
	//map store the value in key value pair
		
		Map map=new HashMap();
		
		map.put("FirstName", "Shivraj");
		map.put("LastName", "Deshmukh");
		map.put("RollNo", 50);
		map.put('a',1);
		map.put("Hi", 'b');  //we can print the object value with the reference of key object
		   //"FirstName"- object key   'Shivraj'- object value
		
		
		System.out.println(map.get("FirstName"));
		System.out.println(map.get("LastName"));
		System.out.println(map.get("1"));
		System.out.println(map.get('a'));

	}

}
