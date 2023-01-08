package practice_test;

public class m12 {
	
	public void m1() {
		
		System.out.println("i am m1");
	}
	
	public void m2() {
		this.m1();
		System.out.println("i am m2");
	}

	public void m3() {
		this.m2();
		System.out.println("i am m3");
	}
	public static void main(String[] args) {
		m12 q=new m12();
		q.m3();

	}

}
