package practice_test;

public class fabonacci_series {

	public static void main(String[] args) {
		
		//Fabonaci series= 0,1,1,2,3,5..
		
		int a=0;
		int b=1;
		int c;
		
		System.out.println(a);
        System.out.println(b);
        
        for(int d=1;d<=10;d++) {
        	
        	c=a+b;
        	System.out.println(c);
        	a=b;
        	b=c;
        	
        }
        
        
	}

}
