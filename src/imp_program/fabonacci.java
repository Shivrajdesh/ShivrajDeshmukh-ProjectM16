package imp_program;

public class fabonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int d=1;d<=10;d++) { 
			
			c=a+b;  //1..2..3..5..8
			System.out.println(c);
			
			a=b;  //1..1..2..3
			b=c;  //1..2..3..5
		}
		
		
	}

}
