package oops_polymorph;

public class a1_overloading { 

	public void login(String email, int pass) {
		
		System.out.println("navigate to home page1");
	}
	
	public void login(int mobNo, String pass) {
		
		System.out.println("navigate to home page2");
	}
	
	public static void main(String[] args) {
		
		a1_overloading a=new a1_overloading();
		
		a.login("shiv@gmail.com",1234);
		
		a.login(1598, "1234");
		
		

	}

}
