package practice_test;

class n11{
	
	public void m1() {
		
		System.out.println("i am m1");
	}
}

class n12 extends n11{
	
	public void m2() {
		
		System.out.println("i am m2");
	}
}

public class inheritance extends n12 {

	
	public static void main(String[] args) {
	inheritance n=new inheritance();
	n.m1();
	n.m2();

	}

}
