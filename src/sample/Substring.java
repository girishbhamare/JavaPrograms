package sample;

import java.util.HashSet;

public class Substring {

	// Given two strings s1 and s2, find if s1 is a substring of s2. If yes,
	// return the index of the first occurrence, else return -1.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "abbccddeffez";
		String str2 = "az";

		HashSet<Character> hashstr1 = new HashSet<Character>();
		HashSet<Character> hashstr2 = new HashSet<Character>();

		for (int i = 0; i < str1.length(); i++) {

			hashstr1.add(str1.charAt(i));

		}
		for (int j = 0; j < str2.length(); j++) {
			hashstr2.add(str2.charAt(j));

		}

		hashstr1.retainAll(hashstr2);

		if (!hashstr1.isEmpty()) {

			System.out.println("Substring is " + hashstr1);

		} else {

			System.out.println("No Substring is presnet");
		}

	}

}
