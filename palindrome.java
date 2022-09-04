import java.util.Scanner;

//Matthew Lee
//CS 1400
//Project 1 Lab 2
//Comment 1


public class palindrome {
	public static void main(String[] args) {

		int palindrome = 0;
		
		String line = "";
		Scanner scnr = new Scanner(System.in);
		do {
			System.out.print("Enter text: ");
			line = scnr.nextLine();
			if (line.length() > 0) {
				line = line.toLowerCase();
				int frontIndex = 0;
				int rearIndex = line.length() - 1;
				boolean isNotPalindrome = false;
				while (frontIndex < rearIndex) {
					while (!Character.isLetter(line.charAt(frontIndex))) {
						frontIndex += 1;
					}
					while (!Character.isLetter(line.charAt(rearIndex))) {
						rearIndex -= 1;
					}
					if (line.charAt(frontIndex) != line.charAt(rearIndex)) {
						isNotPalindrome = true;
						break;
					}
					frontIndex += 1;
					rearIndex -= 1;
				}
				if (!isNotPalindrome) {
					palindrome += 1;
					System.out.println(line + ": Palindrome");
				} else {
					System.out.println(line + ": Not Palindrome");
				}
			}
		} while (line.length() != 0);
		System.out.println("Palindromes found: " + palindrome);
	}
}

