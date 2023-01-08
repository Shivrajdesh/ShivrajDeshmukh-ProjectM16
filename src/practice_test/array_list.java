package practice_test;

import java.util.ArrayList;
import java.util.List;

public class array_list {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add(10);
		list.add("shiv");
		list.add('q');
		list.add(10);
		
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		list.add("deshmukh");
        System.out.println(list);
        
	}

}
