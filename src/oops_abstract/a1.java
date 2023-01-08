package oops_abstract;

abstract class a2{
	
	public void m1() {  //concrete method
		
		System.out.println("Iam method m1");
	}
	
	  abstract void m2();  //abstract method
}


public class a1 extends a2 {  //inheritance concept used
	
	public void m2() {
		
		System.out.println("Iam method m2");
	}
	public static void main(String[] args) {
		
		a1 a=new a1();
		a.m1();
		a.m2();
		

	}

}
