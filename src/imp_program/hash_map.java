package imp_program;

import java.util.HashMap;

public class hash_map {

	public static void main(String[] args) {
		//map store the value in key value pair
		
		HashMap a=new HashMap();
		
		a.put("name", "Shivraj");
		a.put("surname","Deshmukh");
		a.put("Mob num", "9604819370");
		a.put("City", "Nagpur");
		
		System.out.println(a.get("City"));
		a.remove("name");
		System.out.println(a.get("name"));
        a.clear();
        System.out.println(a.get("surname"));
	}

}
