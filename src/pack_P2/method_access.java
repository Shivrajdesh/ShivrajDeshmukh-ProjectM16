package pack_P2;

public class method_access {

	int a=10;// a is instatnce variable
	static int b=20;//b static variable
	
	void add() {
		
	int c=30,d;  //c & d are local variables
	d=a+b+c;
	System.out.println(d);
	}
	void multiplication() {
		
		int e=40,f;//e & f are local variables
		//f=a*b*c*e;     //c shows error because its use within method add() 
		//System.out.println(f);
	}
	
	public static void main(String[] args) {

    method_access q=new method_access();  
    System.out.println(q.a);//10
    System.out.println(q.b);//20
    q.a=1000;
    q.b=4000;
    System.out.println(q.a);//1000
    System.out.println(q.b);//4000
    
    method_access s=new method_access();
    System.out.println(s.a);//10
    System.out.println(s.b);//4000
   // s.a=1000;
    //s.b=2000;
    
    
    
	}

}
