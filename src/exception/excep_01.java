package exception;

public class excep_01 {

	public static void main(String[] args) {
	
	try {	      //risky code (it show/throw risky code)
		int a=10; 
		int b=0; 
		int c;
		c=a/b;  //if a=10 & b=0 then c=a/b shows exception, exception terminate the further process so that's why we perform exception handling
		
		System.out.println(c);
	}
	
	catch(ArithmeticException q){  //Esception handling code (if in try block excetion occure then only catch block execute)
		System.out.println(q);
		}
    
	finally{           //clean up code (file closing code)
		
		System.out.println("shiv");
	}
	}

}
