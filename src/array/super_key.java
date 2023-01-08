package array;


class b1{
	
	b1(){
		
		System.out.println("m1");
	}
}

public class super_key extends b1 {
	
	super_key(){
		
		super();
		
		System.out.println("m2");
	}

	public static void main(String[] args) {
		
		super_key b=new super_key();
		

	}

}
