package imp_program;

class b22{
	
	void m1() {
		
		System.out.println("i am m1");
	}
}

public class b21 extends b22{
	
	void m1() {
		
		System.out.println("i am m2");
	}

	public static void main(String[] args) {
		
   b21 a=new b21();
   
   a.m1();
		
	}

}
