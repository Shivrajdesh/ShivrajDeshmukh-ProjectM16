package Constructor;

public class a21 {
	
	String name;
	
	int marks;
	
	a21(String name, int marks){
		
		this.name=name;
		this.marks=marks;
	}

	public static void main(String[] args) {
		
		a21 a=new a21("shiv", 1230);
		
		System.out.println(a.name);
        System.out.println(a.marks);
		
	}

}
