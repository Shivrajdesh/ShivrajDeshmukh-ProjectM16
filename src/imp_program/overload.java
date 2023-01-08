package imp_program;

public class overload {
	
	void m1(int a) {
		System.out.println("i am m1");
	}
    
	void m1() {
		
		System.out.println("i am m2");
	}
	public static void main(String[] args) {
		
		overload a=new overload();
		
		a.m1(15);
		a.m1();
		
		
	}

}
