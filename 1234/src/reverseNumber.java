import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input number to reverse ==>");
		int number = scanner.nextInt();
		int reverseNumber = 0;
		
		while (number!=0) {
			reverseNumber = reverseNumber*10 + number%10;
			number/=10;
		}
		
		System.out.println("Reversed number==>" + reverseNumber);
	}

}
