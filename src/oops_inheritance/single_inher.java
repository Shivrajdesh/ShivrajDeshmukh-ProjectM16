package oops_inheritance;


class b1{
	
	void m1() {
		
		System.out.println("i am method m1");
	}
}

class b2 extends b1{
	
	void m2() {
		
		System.out.println("i am method m2");
	}
}


public class single_inher {

	public static void main(String[] args) {
		
		b2 a=new b2();
		
		a.m1();
		a.m2();
		

	}

}
