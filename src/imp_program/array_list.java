package imp_program;

import java.util.ArrayList;
import java.util.List;

public class array_list {

	public static void main(String[] args) {
		//handle by index
	    //allow duplicate values
		List a=new ArrayList();

		a.add(10);
		a.add(20);
		a.add(30);
		a.add("shiv");
		a.add(40);
		a.add(20);
		
		System.out.println(a);
		
		System.out.println(a.get(1));
		
		a.remove(3);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
	}

}
