package sample;

/*
 * 
 * The idea is to generate all even length and odd length palindromes and keep track of the longest palindrome seen so far.
To generate odd length palindrome, Fix a centre and expand in both directions for longer palindromes, i.e. fix i (index) as center and two indices as i1 = i+1 and i2 = i-1
Compare i1 and i2 if equal then decrease i2 and increase i1 and find the maximum length. 
Use a similar technique to find the even length palindrome.
Take two indices i1 = i and i2 = i-1 and compare characters at i1 and i2 and find the maximum length till all pair of compared characters are equal and store the maximum length.
Print the maximum length.
 
 */
import java.util.Scanner;

public class LongestPalendrom {
	
	/*
	 * Check String EMpty
	 * Check string length ==1
	 * Check if string is odd
	 * check of string is even
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String");
		String inputString = scanner.nextLine();

		System.out.println("Longest Palendrom is " + LongestPalendrom.getLongestPalendrom(inputString));
		scanner.close();

	}

	public static String getLongestPalendrom(String inputString) {

		if (inputString.isEmpty())
			return "Enter the proepr String";
		// TODO Auto-generated method stub

		if (inputString.length() == 1)
			return inputString;

		String longest = inputString.substring(0, 1);

		for (int i = 0; i < inputString.length(); i++) {
			// odd checking
			String temp = checkEquality(inputString, i, i);

			if (longest.length() < temp.length()) {

				longest = temp;
			}
			temp = checkEquality(inputString, i, i + 1);

			if (longest.length() < temp.length()) {

				longest = temp;
			}
		}
		return longest;

	}

	public static String checkEquality(String inputString, int begin, int end) {

		while (begin >= 0 && end <= inputString.length() - 1 && inputString.charAt(begin) == inputString.charAt(end)) {

			begin--;
			end++;
		}

		return inputString.substring(begin + 1, end);

	}

}
