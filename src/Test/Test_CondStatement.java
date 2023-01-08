package Test;

public class Test_CondStatement {

	public static void main(String[] args) {
		
		int a=60;
		int b=80;
		
		if(a<b) {
			
			System.out.println("a is even no");
		
			if(a>b){  
				
				System.out.println("a is greater than b");
			}
			
			else {
				
				System.out.println("a is less than b");
			}
			
		}
		
		else {
			
			System.out.println("b is greater than a");
		}
	}

}
