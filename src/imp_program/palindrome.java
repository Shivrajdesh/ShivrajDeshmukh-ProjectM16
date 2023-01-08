package imp_program;

public class palindrome {

	public static void main(String[] args) {
		
		int a=141;
		
        int b=a;  //141
        
        int rem;
        int rev=0;
        
        while(b!=0) {
        	rem=b%10;   //1
        	rev=rev*10+rem;  //14*10+1=141
        	b=b/10;  //14..1rem
        	
        }
        if(rev==a) {
        	
        	System.out.println("this is palindrome");
        }
        else {
        	
        	System.out.println("this is not a palindrome");
        }

	}

}
