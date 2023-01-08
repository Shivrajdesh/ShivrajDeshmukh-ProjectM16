package oops_polymorph;

class c1{
	
	public void m1(int a) {
		
		System.out.println("i am m1");
	}
}

public class override extends c1 {

	  public void m1() {
			  
			  System.out.println("i am m2");
		  }
	  
	
	public static void main(String[] args) {
		
      override q=new override();
      
      q.m1();
      
	 
	}

}
