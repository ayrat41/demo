package variables;

public class IntegersReverse {
	
	public static void main(String[] args) {
		int i = 42938;
	    int rev = 0;
		while (i!=0) {
			rev = rev*10+i%10;
			i/=10;
		};
		System.out.println(rev);
	}

}
