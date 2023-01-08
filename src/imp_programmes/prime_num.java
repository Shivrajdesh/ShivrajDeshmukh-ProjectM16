package imp_programmes;

public class prime_num {

	public static void main(String[] args) {

		int no=25;
		int a=0;
		
		for(int b=1;b<=no;b++) {
			
			if(no%1!=0) {
				
		     a=a+1;
			}	
		}
		
		if(a!=0) {
			
			System.out.println("It is prime a number");
		}
		else {
			
			System.out.println("It is not a prime number");
		}
		
	}

}
