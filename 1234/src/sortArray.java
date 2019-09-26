import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		int array1 []= {2,3,5,7,9};
		int array2 []= {1,4,6,8,10};
		int array3 [] = new int[array1.length+array2.length];
		
		for (int i=0; i<array3.length-array2.length; i++) {
			array3[i]=array1[i];
		}
		
		for (int i=0; i<array3.length-array2.length; i++) {
			array3[i+array1.length]=array2[i];
		}
		
		Arrays.sort(array3);
		
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
	}

}
