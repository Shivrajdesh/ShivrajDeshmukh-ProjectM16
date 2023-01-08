package string_megthods;

public class split {

	public static void main(String[] args) {
		
		String a="Hii@My@name@is@Shivraj@";
		
		String[] b=a.split("@");
		
		String b1=b[0];
		String b2=b[1];
		String b3=b[2];
		String b4=b[3];
		String b5=b[4];
		
		System.out.println(b1+" "+b2+" "+b3+" "+b4+" "+b5);

	}

}
