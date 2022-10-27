package com.experion.Assignment;

public class Q10NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentNumber=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(currentNumber+" ");
				currentNumber++;
			}
			System.out.println();
		}

	}

}
