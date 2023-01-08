package string;

public class d1 {

	public static void main(String[] args) {
		
		String a="shivraj";
		
		String b="";
		
		int L=a.length();
		
		
		for(int d=L-1;d>=0;d--) {
			
			b=b+a.charAt(d);
		}
		
       System.out.println(b);
	}

}
