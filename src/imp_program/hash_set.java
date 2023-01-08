package imp_program;

import java.util.HashSet;

public class hash_set {

	public static void main(String[] args) {
		//not handle by index
		//not allow duplicate values
		
		HashSet a=new HashSet();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add("shiv");
		a.add(40);
		a.add(20);
		
		System.out.println(a);
		System.out.println(a.contains(10)); //if value is exist in above list then give o/p true otherwise false
	    System.out.println(a.isEmpty()); //false
	    a.remove(20);
	    System.out.println(a);
	    a.clear();
	    System.out.println(a.isEmpty()); 

		

	}

}
