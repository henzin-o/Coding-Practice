package test;

import java.util.Scanner;

public class Names {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		String names[] = {"Aaron", "Aina", "Chrysgel", "Kai", "Purps", "Sushi", "Wyn", "Kachie", "Vort", "Ash", "Nohz", "Grexle",};
		
		String searchName = scanner.nextLine();
		boolean foundName = false;
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(searchName)) {
				foundName = true;
				break;
			}
		}
				
		if (foundName) {
			System.out.println(searchName + " was found in the System!");
		}
		else
			System.out.println(searchName + " was not found in the System!");
	
		scanner.close();
	}

}
