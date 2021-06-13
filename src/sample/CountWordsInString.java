package sample;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss="IAmGirishBhamare";
		
		//char [] ch= ss.toCharArray();
		
		int count=0;
		
		for (int i =0; i<ss.length();i++){
			
			
			
			if((ss.charAt(i)>=(char)65) &&(ss.charAt(i)<=(char)90) ){
				
				count++;
				
			}
		}
		
		System.out.println("count is" +count);

	}
}
