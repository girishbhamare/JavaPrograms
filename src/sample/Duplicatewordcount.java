package sample;

import java.util.HashMap;
import java.util.Map;

public class Duplicatewordcount {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
//		String str1="java is java";
//		
//		String [] ss= str1.split(" ");
//		
//		Map<String, Integer> wordcount= new HashMap<String, Integer>();
//		
//		
//		for (String str:ss){
//			
//			if(wordcount.containsKey(str)){
//				
//				
//				wordcount.put(str, wordcount.get(str)+1);
//				
//				
//			}else{
//				
//				wordcount.put(str, 1);
//			}	
//			
//			
//		}
//		
//		System.out.println("duplicate count is " +wordcount);
		
		String givenstr= "Java is Java is";
		
		String [] strarray= givenstr.split(" ");
		Map<String, Integer> wordcount =new HashMap<>();
		
		for (String strval:strarray){
			
			if(wordcount.containsKey(strval)){
				
				wordcount.put(strval, wordcount.get(strval)+1);
			}else{
				
				wordcount.put(strval, 1);
			}
			
		}
		System.out.println("duplicate count is " +wordcount);

	}

}
