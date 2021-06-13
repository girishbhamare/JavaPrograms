package sample;

import java.util.HashMap;
import java.util.Map;

public class NumbertoChar {

	public static void main(String[] args) {
		
		String ss ="aabbcc";
		
		char [] ch = ss.toCharArray();
		
		Map<Character, Integer> charcount = new HashMap<Character, Integer>();
		
		for (char ch1:ch){
			
			if (charcount.containsKey(ch1)){
				
				charcount.put(ch1, charcount.get(ch1)+1);
			}
			else{
				charcount.put(ch1, 1);
			}		
			
			
		}
		System.out.println("duplicate character is " +charcount);
		
		/**
		 * 		String st = "G1e3E2K3s2";
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
		 */
		
		
		String inputStr= "a2b2c2";
		
		char [] charray= inputStr.toCharArray();
		 int l=0;
		 
		 char c='0';
		 
		 for (int i=0; i< charray.length;i++){
			 
			 if(Character.isLetter(charray[i])){
				 
				 c=charray[i];
				 
			 } else if (Character.isDigit(charray[i])){
				 l= Character.getNumericValue(charray[i]);
				 
				 for (int j=0;j<l;j++){
					 System.out.print(c);
				 }
				 
			 }
			 
			 
			 
			 
		 }
		
		


	}

}
