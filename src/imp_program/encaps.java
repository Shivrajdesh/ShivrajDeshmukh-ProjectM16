package imp_program;


public class encaps {

	private String a;
	
	public void setName(String a) {
		
		this.a=a;
	}
	
	public String getName() {
		
		return a;
	}
	public static void main(String[] args) {
		
		encaps q=new encaps();
		
		q.setName("shiv");
		System.out.println(q.getName());
		

	}

}
