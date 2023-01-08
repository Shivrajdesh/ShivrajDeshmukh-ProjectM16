package oops_abstract; //we can achieve 100% abstraction but only some exception 8th & 9th version after

interface a11{         //in updated version we declare private, static & default concrete method as well in the interface
	
	void m1();  //by default consider as abstract method
	
	int a=20;   //by default consider as public static final
	
	// java 8th version
	
	//default concrete method we can write
	
	default void m2() {
		
		System.out.println("m2");
	}
   static void m3() {    //by default consider as public  (default concrete method)
	   
	   System.out.println("m3");
   }
	
   //java 9th version we can write private method as well
   
    private void m4() {   //(default concrete method)can we write concrete method in interface..yes..
    	
    	System.out.println("m4");
    }
   
    //if we override the class at that time we can provide body to abstract method as well
}

public class a12 implements a11{
	
	public void m1() {
		
		System.out.println("m1");
	}


	public static void main(String[] args) {
		 
	a12 a1=new a12();
		
		a1.m1();

	}

}
