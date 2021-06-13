package sample;

public class Reversesentense {

	public static void main(String[] args) {
//		String sample= "hello how are you";
//		
//		String array []= sample.split(" ");
//		
//		String mainString="";
//		for (String rev:array){
//			String reverse="";
//			System.out.println("words " +rev);
//			for (int i=rev.length()-1; i>=0;i--){
//				
//				reverse=reverse+rev.charAt(i);				
//				
//			}			
//			System.out.println("main string" +mainString);
//
//			mainString=mainString+reverse+" ";
//			
//		}
//	
//		System.out.println("main string" +mainString);
		
		String ss= "hello how are you";
		String arr []= ss.split(" ");
		
		String mainString="";
		
		for (String str: arr){
			
			String rev="";
			
			for (int i=str.length()-1; i>=0; i--){
				
				rev= rev+str.charAt(i);
			}
			
			System.out.println("Reverse string is " +rev);
			mainString = mainString+rev+ " ";
		}
		System.out.println("main string" +mainString);
		
		//2nd method 
		StringBuffer sf = new StringBuffer(ss);
		System.out.println("reverse" + sf.reverse());
	}

}


//String ss = "hello how are you";
//
//String [] strarr= ss.split(" ");
//
//String mainstring="";
//for (String rev:strarr){
//	
//	String reverse = " ";
//	System.out.println("words " +rev);
//	for (int i=rev.length()-1; i>=0;i--){
//		
//		reverse= reverse + rev.charAt(i);
//		
//	}
//	mainstring=mainstring+reverse+ " "	;		
//	
//}
//System.out.println("main string reverse" + mainstring);