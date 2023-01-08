package practice_test;

import java.util.HashSet;

public class hash_set {

	public static void main(String[] args) {
		HashSet set=new HashSet();
	
		set.add("shiv");
		set.add(20);
		set.add(30);
		set.add(20);
		
		System.out.println(set);
		set.remove(20);
		System.out.println(set);
		set.add(40);
		System.out.println(set);
		
	}

}
