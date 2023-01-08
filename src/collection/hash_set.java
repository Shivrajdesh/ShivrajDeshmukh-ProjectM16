package collection;

import java.util.HashSet;
import java.util.Set;

public class hash_set {

	public static void main(String[] args) {
		
	
		//not allow duplicate value
		//not handle by index
		
		Set set=new HashSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add("shiv");
		set.add(0.1);
		set.add("shiv"); //not getting duplicate value in output
		
		System.out.println(set);
		System.out.println(set.contains(5)); //if value is exist in above list then give o/p true otherwise false
	    System.out.println(set.isEmpty()); //false
	    set.remove(2);
	    System.out.println(set);
	    set.clear();
	    System.out.println(set.isEmpty()); 

	}

}
