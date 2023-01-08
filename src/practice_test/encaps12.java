package practice_test;

public class encaps12 {
	
	private int RollNo;
	
	public void setm1(int RollNo) {
		
		this.RollNo=RollNo;
	}
	
	public int getm2() {
		
		return RollNo;
	}

	public static void main(String[] args) {
		encaps12 e=new encaps12();
		e.setm1(20);
		System.out.println(e.getm2());

	}

}
