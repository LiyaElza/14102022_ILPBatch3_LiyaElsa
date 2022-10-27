package com.experion.Assignment;

import java.util.Scanner;

public class Q16ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String sentence=scanner.nextLine();
		System.out.println("Enter the character to be replaced :");
		char findChar=scanner.next().charAt(0);
		System.out.println("Enter the character wanted : ");
		char replaceChar = scanner.next().charAt(0);
		StringBuffer string=new StringBuffer(sentence);
		for(int index=0; index<string.length();index++)
		{
			if(sentence.charAt(index)==findChar)
			{
				string.setCharAt(index, replaceChar);
			}
		}
		System.out.println("The modified string : "+string);

	}

}
