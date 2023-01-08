package practice_test;

public class this_key {

	int a;
	
	void m1(int a) {
		
		this.a=a;
	}
	public static void main(String[] args) {
		
		this_key q=new this_key();
		q.m1(20);

	}

}
