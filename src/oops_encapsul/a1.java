package oops_encapsul;

public class a1 {

	private int RollNo;    //data hiding
	
	public void setRollNo(int RollNo) {
		
		this.RollNo=RollNo;
		}
	
	public int getRollNo(){
		
		return RollNo;
	}
	
	public static void main(String[] args) {
		
		a1 a=new a1();
		a.setRollNo(101);
		
		System.out.println(a.getRollNo());

	}

}
