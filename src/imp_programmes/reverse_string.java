package imp_programmes;

public class reverse_string {

	public static void main(String[] args) {

		String a1="Shivraj";
		String a2="";
		
		int L=a1.length();
		for(int i=L-1;i>=0;i--) {
			
			a2=a2+a1.charAt(i);
		}
		System.out.println(a2);
		
		
	}

}
