package Test;

public class Test_2 {

	int a=10;
	static int b=20;
	
	public static void main(String[] args) {
	
		System.out.println(Test_2.b);
		
		Test_2.m2();
		
		Test_2 test=new Test_2();
		
		
	}
	
    public void m1() {
    	System.out.println("M1");
    }
    
    public static void m2() {
    	System.out.println("M2");
    }
}
