package imp_programmes;

public class palindrome_num {

	public static void main(String[] args) {
		int no=131;
		int a=no;    //131
		int rem;
		int rev=0;
		
	 	while(a!=0) {    
			
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		
		if(no==rev) {
			
			
			System.out.println("It is a palindrome number");
		}
		
		else {
			
			System.out.println("It is not a palindrome number");
		}
		System.out.println();
	}

}
