package exception;

public class q21 {

	public static void main(String[] args) {
		try {
		int a=50;
		int b=0;   
		int c;
		c=a/b;      //ArithematicException
		
		System.out.println(c);
		}
		
		catch(ArithmeticException q) {
			
			System.out.println(q);
		}
		
	
		System.out.println("hello");
		
	}

}
