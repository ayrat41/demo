package LabdaExpression;

import java.util.Comparator;

public class comparatorOldVsLambda {

	public static void main(String[] args) {
//		Comparator<String> oldComparator = new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		};
//		
//		int c = oldComparator.compare("hello", "o");
//		System.out.println("Zero method ==>" + c );
		
		Comparator<String> comparatorLambda = (o1, o2)->o1.compareTo(o2);
		
		int c1 = comparatorLambda.compare("hello", "o");
		System.out.println("Lambda method ==>" + c1 );
	}

}
