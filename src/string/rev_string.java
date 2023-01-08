package string;

public class rev_string {

	public static void main(String[] args) {
		
		String a="Hello";
		
		String b="";
		
		int c=a.length();
		
		for(int d=c-1;d>=0;d--) {
			
			b=b+a.charAt(d);
			
		}

		System.out.println(b);
	}
	

}
