package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class a1{       //throws keyword
	
	void m1() throws FileNotFoundException{
		
		//if we have to read data of any file then we have to create FileInputStream name class taken & we have create object of that.
		//write in bracket from which we have to take the data like from c drive from a folder abc file so from which we read data.
		//FileInputStream already throw exception but which that is file not excetion so we import it from java.io
		//if we call to m1 then jvm ask to m1 method are handle exception or not then m1 method says i am not handle it so speak with main method so at that time throw keyword used
		FileInputStream file=new FileInputStream("\\c:d.abc");
	}
}

public class excep_02 {

	public static void main(String[] args) {
		
		a1 a=new a1();
		
		try {
		a.m1(); //FileNotFoundException
		}
		catch(FileNotFoundException q){
			
	    System.out.println(q);
	    
		}
		
		System.out.println("hii");
		

	}

}
