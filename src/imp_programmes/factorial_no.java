package imp_programmes;

public class factorial_no {

	public static void main(String[] args) {
		int a=5;//5*4*3*2*1=120
		int f=1;
		
		for(int b=1;b<=a;b++) {//1..2..3..4..5
			
			f=f*b;	//1..2..6..24..120
		}
		System.out.println(f);
		

	}

}
