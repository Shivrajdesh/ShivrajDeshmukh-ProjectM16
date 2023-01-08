package imp_program;

public class prime_number {

	public static void main(String[] args) {

	int a=3;
	int b=0;
	
	for(int c=1;c<=a;c++) {//1..2..3..4
		
		if(a%c==0) { // true..false..true
			
			b++;//1..2
		}
	}
	if(b==2) { //2==2
		
		System.out.println("This is prime number");
	}
	else {
		
		System.out.println("This is not a prime number");
	}

	}

}
