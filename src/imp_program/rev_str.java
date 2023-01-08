package imp_program;

public class rev_str {

	public static void main(String[] args) {
		String a="shiv";
		String b="";
		
		int c=a.length();  //4
		
		for(int d=c-1;d>=0;d--) { //3--2--1--0
			
			b=b+a.charAt(d); //v..i..h..s...b=vihs
					
		}
		System.out.println(b);
	}

}
