package oops_abstract;

interface inter1{
	
	void m1(); //by default consider as public abstract
	
	//int a=10;  //by default consider as public static final
	
	//default void m2() {
		
		//System.out.println("m2");
	//}
	
	//static void m3() { //by default consider as public
		
		//System.out.println("m3");
	//}
	
	//java 9th version
	
	//private void m4() {
		
		//System.out.println("m4");
	//}
	
}

public class c1_interface implements inter1 {
	
	public void m1() {
		
		System.out.println("m1");
	}

	public static void main(String[] args) {
		
		c1_interface a=new c1_interface();
		
		a.m1();
		

	}

}
