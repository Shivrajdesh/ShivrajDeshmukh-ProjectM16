package imp_programmes;

public class palindr_no {

	public static void main(String[] args) {
		
		int no=1341;
		int a=no;    //1341
		int rem;
		int rev=0;
		
	 	while(a!=0) {    
			
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;             //134
		
	 	}
	 	
	 	
	 	System.out.println(rev);

	}

}
