package casting;

public class narrowing {

	public static void main(String[] args) {
		int a=10;
		// byte b=a; //if we take like this then it shows error so that we do add to cast
		byte b=(byte) a;
	   System.out.println(a);  //10
	   System.out.println(b);  //10

	}

}
