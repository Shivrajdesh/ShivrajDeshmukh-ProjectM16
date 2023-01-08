package Constructor;

class b23{
	
	int a;
	
}

public class b21 extends b23 {

	public void m1(int a) {
		
     super.a=a;
     
     
	}
	
	public static void main(String[] args) {
		
   b21 a=new b21();
   
   a.m1(20);
   
		
	}

}
