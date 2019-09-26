public class PrintStarsTriangle {

	public static void main(String[] args) {
			char star = '*';
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < i+1; j++) {
					System.out.print(" "+star);
				}
				System.out.println("");
			}
	}

}
