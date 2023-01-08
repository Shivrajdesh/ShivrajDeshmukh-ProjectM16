package practice_test;

public class encaps {
private String b;

public void setterName(String b) {
	
	this.b=b;
}

public String getterName() {
	
	return b;
}
	public static void main(String[] args) {
		encaps f=new encaps();
		f.setterName("shivraj");
		
		System.out.println(f.getterName());

	}

}
