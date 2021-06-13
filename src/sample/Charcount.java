package sample;

import java.util.HashMap;
import java.util.Map;

public class Charcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ss = "GeeeEEKKKss";

		char[] ch = ss.toCharArray();

		Map<Character, Integer> charcount = new HashMap<Character, Integer>();

		for (char ch1 : ch) {

			if (charcount.containsKey(ch1)) {
				charcount.put(ch1, charcount.get(ch1) + 1);
			} else {
				charcount.put(ch1, 1);
			}
		}

		System.out.println("Duplicate count is :" + charcount);
		
		
		System.out.println("-----------------input A2B3-> AABBB------------------------------");
		
		String st = "G1e3E2K3s2";
		String st1 = "";
		int l = 0;
		char ar[] = st.toCharArray();
		char c = '0';
		for (int i = 0; i < ar.length; i++) {
			if (Character.isLetter(ar[i])) {
				c = ar[i];
			} else if (Character.isDigit(ar[i])) {
				l = Character.getNumericValue(ar[i]);
				for (int j = 0; j < l; j++) {
					System.out.print(c);
				}
			}

		}
		

	}

}
