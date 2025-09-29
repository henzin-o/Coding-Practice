package test;

import java.util.Scanner;

public class NumberChecker {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int [] [] numbers = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		int searchNum = scanner.nextInt();
		boolean foundNum = false;
		
		searchLabel : for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (searchNum == numbers[i] [j]) {
					foundNum = true;
					break searchLabel;
				}
			}
			
		}
		if (foundNum)	{
			System.out.println(searchNum + " Found!");
		}
		else
			System.out.println(searchNum + " Not Found!");
		
		scanner.close();
	}
}
