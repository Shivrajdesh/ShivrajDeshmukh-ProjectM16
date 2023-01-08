package imp_program;

public class palindrome_demo01 {

	public static void main(String[] args) {
		int a=162;
		int b=a;
		int rem;
		int rev=0;
		while(b!=0) {
			rem=b%10;  //1
			rev=rev*10+rem; //161
			b=b/10; //16  rem=1
		}
		if(rev==a) {
			System.out.println("palindrome no.");
			
		}
		else {
			
			System.out.println("not palindrome no.");
		}
		

	}

}
