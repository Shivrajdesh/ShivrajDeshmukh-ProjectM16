package oops_polymorph;

class a3{
	
	public void m1(){
		
		System.out.println("Hello");
	}
	
} 

public class a2_overriding extends a3{
	
	public 
	void m1() {
		
		 System.out.println("Hi");
	} 

	public static void main(String[] args) {
		
		a2_overriding a=new a2_overriding();
		
		a.m1();

	}

}
