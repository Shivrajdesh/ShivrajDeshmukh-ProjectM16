package practice_test;

import java.util.HashMap;

public class hash_map {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		
		map.put("First name", "Shivraj");
		map.put("Last Name", "Deshmukh");
		map.put("id", 188590);
		
		System.out.println(map.get("id"));
		System.out.println(map.get("First name"));

	}

}
