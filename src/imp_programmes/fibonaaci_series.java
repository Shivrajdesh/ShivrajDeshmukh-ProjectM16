package imp_programmes;

public class fibonaaci_series {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
        int c;
        
       for(int d=1;d<=10;d++) {//1..2..3..
    	   
    	   c=a+b;//1..2..3..5
    	   System.out.println(c);//1..2..3..5
    	   a=b;//1..1..2
    	   b=c;//1..2..3
    

	}

}
}
