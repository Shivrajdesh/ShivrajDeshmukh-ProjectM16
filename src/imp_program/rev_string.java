package imp_program;

public class rev_string {

	public static void main(String[] args) {
		String a="Shivraj";
		String b="";
		
		int c=a.length();
		
		for(int d=c-1;d>=0;d--) {
			
			b=b+a.charAt(d);
			
		}
		System.out.println(b);
	}

}
