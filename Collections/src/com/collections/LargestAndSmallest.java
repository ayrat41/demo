package com.collections;

public final class LargestAndSmallest {

	public static void main(String[] args) {
		int [] numbers = {12, 35 , 35, -44, 2924, -245};
		int largest = numbers[0];
		int smallest = numbers[0];
		for(int i = 1; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			} else if (numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		System.out.println("Larest number = " + largest);
		System.out.println("Smallest number = " + smallest);
	}

}
