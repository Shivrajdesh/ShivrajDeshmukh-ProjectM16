package oops_abstract;

interface b12{   //interface achieve by using multiple inheritance
	
	default void m1() {
		
		System.out.println("i am m1");
	}
}
 interface b13{
	 
	 default void m2() {
		 
		 System.out.println("i am m2");
	 }
	 
 }
public class b11 implements b12,b13 {

	public static void main(String[] args) {
		
		b13 a=new b11();  //inherits both methods properties but call only one method
		b12 a1=new b11();  //for that we have to take another ref to call the other method
		
		a1.m1();
		a.m2();

	}

}
