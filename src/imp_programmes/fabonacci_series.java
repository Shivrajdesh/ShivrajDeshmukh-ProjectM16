package imp_programmes;

public class fabonacci_series {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
        System.out.println(b);
        
        for(int d=1;d<=15;d++) {
        	
        	c=a+b;  
        	System.out.println(c);
        	a=b;    
        	b=c;
        	
        }
	}

}
