package variables;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Numbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input first number a = ");
		int a = input.nextInt();
		System.out.print("Input second number b = ");
		int b = input.nextInt();
	for (int i = a; i <= b; i++) {
		System.out.println(i + ",");
		
	}
	
	input.close();}
}
