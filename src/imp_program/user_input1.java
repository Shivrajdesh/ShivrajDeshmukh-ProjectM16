
package imp_program;

import java.util.Scanner;

public class user_input1 {

	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		Scanner a=new Scanner(System.in);
		
		int b=a.nextInt();
		
		while(b<=20) {
			
			if(b%2==0) {
				
				System.out.println(b);
			}
			b++;
		}
		
	}

}
