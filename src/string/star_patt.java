package string;

public class star_patt {

	public static void main(String[] args) {
		
		
		for(int a=1;a<=5;a++) {  //1--2--3--4--5
			
			for(int b=1;b<=a;b++) {//4--3--2--1--0
				
				System.out.print(" ");//----
				                      //---
				                      //--
				                      //-
				                      //
		
		   }
			
		for(int c=4;c>=a;c--) {//*  1--2--3--4--5
			                   //**
			                   //***
			                   //****
			                   //*****
			
			System.out.print("* ");
		}	
			
		System.out.println();
		}
		
	}

}
