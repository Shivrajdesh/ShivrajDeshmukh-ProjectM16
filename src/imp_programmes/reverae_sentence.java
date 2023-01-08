package imp_programmes;

public class reverae_sentence {
    public static String m1(String a) {
		String[] a1=a.split(" ");
    	String a2="";
    	
    	for(int i=a1.length-1;i>=0;i--) {
    		
    		if(i==0) {
    			a2=a2+a1[i];
    		}
    		else {
    			a2=a2+a1[i]+" ";
    		}
    		
    	}
		return a2;
    	
    }
	
	public static void main(String[] args) {
		String a="I am possible";
		
		System.out.println(m1(a));

		
	}
}
