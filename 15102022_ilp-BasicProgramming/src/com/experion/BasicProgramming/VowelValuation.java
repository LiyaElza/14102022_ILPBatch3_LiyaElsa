package com.experion.BasicProgramming;

import java.util.Scanner;

public class VowelValuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char character;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the character to be checked");
		
		character=scanner.next().charAt(0);
		
		switch(character)
		{
		case 'a' : System.out.println(character+" is a vowel.");
			break;
		case 'e' : System.out.println(character+" is a vowel.");
			break;
		case 'i' : System.out.println(character+" is a vowel.");
			break;
		case 'o' : System.out.println(character+" is a vowel.");
			break;
		case 'u' : System.out.println(character+" is a vowel.");
			break;
		default : System.out.println(character +" is a consonant.");
		
		}

	}

}
