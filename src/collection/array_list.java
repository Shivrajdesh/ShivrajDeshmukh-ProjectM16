package collection;

import java.util.ArrayList;
import java.util.List;

public class array_list {

	public static void main(String[] args) {
		
		//allow duplicate value		
		//we can handle by index
		
		List list=new ArrayList();
	
		list.add(1);
		list.add(2);
		list.add('a');
		list.add("shiv");
		list.add(0.1);
		list.add("shiv");  //allow duplicate value
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);

		System.out.println(list.get(2)); //we can handle by index
	}

}
