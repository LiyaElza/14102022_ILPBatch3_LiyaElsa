package com.experion.Assignment;

import java.util.Scanner;

public class Q17NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int wordCount=1;
		System.out.println("Enter the sentence :");
		String sentence=scanner.nextLine();
		for(int index=0; index<sentence.length();index++)
		{
			if(sentence.charAt(index)==' ')
			{
				wordCount++;
			}
		}
		System.out.println("Number of Words : "+wordCount);
	}

}
