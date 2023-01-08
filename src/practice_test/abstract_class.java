package practice_test;

abstract class b21{
	
	void m1() {
		System.out.println("i am m1");
	}
	
	abstract void m2();
}
public class abstract_class extends b21{
	
	void m2() {
		
		System.out.println("i am m2");
	}

	public static void main(String[] args) {
		
		abstract_class q=new abstract_class();
		q.m1();
		q.m2();

	}

}
