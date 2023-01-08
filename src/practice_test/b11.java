package practice_test;

public class b11 {
	
	public void m1(String Name, int Id) {
		System.out.println("i am m1 n");
		
	}
	
	public void m1(int points) {
		System.out.println("i am m1 p");
		
	}

	public static void main(String[] args) {
		b11 q=new b11();
		
		q.m1("Shivraj", 188590);
		q.m1(250);

	}

}
