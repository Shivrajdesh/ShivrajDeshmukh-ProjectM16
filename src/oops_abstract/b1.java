package oops_abstract;

abstract class b2{
	
	public void m1() {
		
		System.out.println("Iam method m1");
	}
   abstract void m2();
}


public class b1 extends b2 {

	   public void m2() {
		   	   
		  System.out.println("Iam method m2");
	   }
	
	public static void main(String[] args) {
		
		b1 a=new b1();
		a.m1();
		a.m2();
	}

}
