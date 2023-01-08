package imp_program;

public class exception_hand {

	public static void main(String[] args) {
	try {	int a=10;
		int b=0;
		int c;
		c=a/b;
		
		System.out.println(c);
	}
	
	catch(ArithmeticException q) {
		
		System.out.println(q);
	}
	finally{
		System.out.println("succeed");
		
	}
	}

}
