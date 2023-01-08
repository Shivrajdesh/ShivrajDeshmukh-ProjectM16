package practice_test;

public class overloading {
	
	
	public void m1(String a, int b) {
		System.out.println("i am m1");
		
	}
	
	public void m1(int c) {
		
		System.out.println("i am m2");
	}

	public static void main(String[] args) {
		overloading v=new overloading();
		v.m1("Shivraj", 1997);
		v.m1(2);

	}

}
