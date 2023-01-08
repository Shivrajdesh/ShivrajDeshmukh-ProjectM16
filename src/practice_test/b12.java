package practice_test;

class b10{
	
	public void m1() {
		System.out.println("i am m1 one");
		
	}
}

public class b12 extends b10 {
	
	public void m1() {
		System.out.println("i am m1 two");
		
	}

	public static void main(String[] args) {
		b12 q=new b12();
		q.m1();

	}

}
