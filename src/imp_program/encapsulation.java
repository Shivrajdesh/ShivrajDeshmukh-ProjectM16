package imp_program;

public class encapsulation {

	private int a;
	public void setEmpcode(int Empcode) {
		
		this.a=Empcode;
	}
	
	public int getEmpcode() {//we have to take return type as'int' set data type
		
		return a;
	}
	
	public static void main(String[] args) {
		//we need to declare variable as private
		//use getter & setter method
		//in this setter method instance variable take in getter method

		encapsulation b=new encapsulation();
		b.setEmpcode(20);
		
		System.out.println(b.getEmpcode());
	}

}
