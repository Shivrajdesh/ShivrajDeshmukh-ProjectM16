package imp_programmes;

public class add_integers {

	int a=10;
	
	int b=20;
	
	String c="Addition is";
	
	public void m1() {
		
		int d=a+b;//10+20=30
		
		System.out.println(d);
		
	}
	
	public static void main(String[] args) {
		
		add_integers q=new add_integers();
		
		System.out.println(q.a);
		System.out.println(q.b);
		System.out.println(q.c);
		q.m1();
	}

}
