
import java.util.Random;
public class RandomINt {

	public static void main(String[] args) {
		Random dice = new Random();
//		int number;
//		for (int i = 1; i < 10; i++) {
//			number = 1+dice.nextInt(9);
//			System.out.println(number);
//		}
		for (int i=0; i<30; i++) {
		System.out.println(dice.nextInt(10));
		}
	}

}
