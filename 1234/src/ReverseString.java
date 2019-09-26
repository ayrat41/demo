import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		StringBuffer sBuffer = new StringBuffer(string);
		System.out.println(sBuffer.reverse());
	}

}
