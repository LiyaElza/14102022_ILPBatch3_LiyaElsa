package com.experion.Assignment;

import java.util.Scanner;

public class Q11FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getdata();
		count();
	}

	static int array[] = new int[10];
	static int key;
	static int limit;

	public static void getdata() {
		Scanner scanner = new Scanner(System.in);
		int index;
		System.out.println("Enter the limit :");
		limit=scanner.nextInt();
		for (index = 0; index < limit; index++) {
			System.out.println("Enter the Number");
			array[index] = scanner.nextInt();
		}
		System.out.println("Enter number to find frequency");
		key = scanner.nextInt();
	}

	public static void count() {
		int index, count = 0;
		for (index = 0; index < 10; index++) {
			if (array[index] == key)
				count = count + 1;
		}
		System.out.println("Frequency=" + count);

	}

}
