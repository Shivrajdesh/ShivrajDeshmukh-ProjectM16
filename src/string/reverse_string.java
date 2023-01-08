package string;

public class reverse_string {

	public static void main(String[] args) {
		
		String a1="shivraj";
				
		String a2="";
		
		int L=a1.length();
		
		for(int b=L-1;b>=0;b--) {
			
			a2=a2+a1.charAt(b);
		}

		System.out.println(a2);

	}

}
