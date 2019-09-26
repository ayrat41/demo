
public class loop50exit30 {

	public static void main(String[] args) {
		for (int i = 0; i < 51; i++) {
			System.out.println("Loop number "+i);
			if (i==30) {
				System.out.println("exit");
				break;
			}
		}

	}

}
