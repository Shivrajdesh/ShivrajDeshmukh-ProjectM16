package imp_program;

public class rev_num02 {

	public static void main(String[] args) {
		int num=58615,rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;		
		}
		System.out.println(rev);
		
	}

}
