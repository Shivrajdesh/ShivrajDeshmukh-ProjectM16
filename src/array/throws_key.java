package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ThrowKey{
	
	void m1() throws FileNotFoundException {
		
		FileInputStream file=new FileInputStream("\\c:d.abc");
	}
}

public class throws_key {

	public static void main(String[] args) {
		ThrowKey b=new ThrowKey();
	try {	
		b.m1();
	}
	catch(FileNotFoundException f) {
		System.out.println(f);
	}
	
	System.out.println("Hii my name is Shiv");
	}

}
