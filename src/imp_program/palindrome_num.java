package imp_program;

public class palindrome_num {

	public static void main(String[] args) {
		int a=131;
		int b=a;  //131
		int rem;
		int rev=0;
		
		while(b!=0) {
			rem=b%10; //1
			rev=rev*10+rem; //131
			b=b/10;
		}
		if(rev==a){
			
			System.out.println("This is palindrome number");
		}
		else {
			System.out.println("This is not palindrome number");
		}
	}

}
