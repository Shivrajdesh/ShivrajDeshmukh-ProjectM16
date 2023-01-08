package Constructor;

public class constructor {

	constructor(int a){
		  
		  System.out.println("m1");
	  }
	  
	constructor(){
		  
		  this(1);
		  
		  System.out.println("m2");
	  }
	  
	public static void main(String[] args) {
		constructor a=new constructor();

	}

}
