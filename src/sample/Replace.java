package sample;

import java.util.ArrayList;

public class Replace {

	public static void main(String[] args) {
		int count = 0;
		String s = "Tomorrow";
		char[] c = s.toCharArray();

		ArrayList<Character> aList = new ArrayList<Character>();

		for (int i = 0; i < c.length; i++) {

			if (c[i] != 'o') {

				aList.add(c[i]);
			} else {
				count++;
				for (int j = 1; j <= count; j++) {
					aList.add('$');
				}

			}

		}

		for (int i = 0; i < aList.size(); i++) {

			System.out.print(aList.get(i));
		}

	}

}
