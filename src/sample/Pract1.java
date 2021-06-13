package sample;

public class Pract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String ss= "Java is Java";
//		
//		String ss1[]=ss.split(" ");
//		
//		String mainstr="";
//		
//		for (String ss2 :ss1){
//			
//			String rev="";
//			
//			for(int i=ss2.length()-1;i>=0;i--){
//				rev=rev+ss2.charAt(i);
//			}
//				
//				mainstr=mainstr+rev+" ";
//			}
//			
//		System.out.println("reverse string is" +mainstr);

		
		String toReverse= "Java is Java";
		
		String [] wordstring= toReverse.split(" ");
		String mainstring="";
		
		for (String str:wordstring){
			
			String revstring="";
			
			for (int i=str.length()-1;i>=0;i--){
				
				revstring=revstring+str.charAt(i);
				
			}
			
			mainstring=mainstring+revstring+" ";
			
			
		}
		
		System.out.println("reverse string is" +mainstring);
	}

}
