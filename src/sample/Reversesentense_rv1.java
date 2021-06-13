package sample;

public class Reversesentense_rv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String ss = "hello how are you";
//		
//		String [] strarr= ss.split(" ");
//		
//		String mainstring="";
//		for (String rev:strarr){
//			
//			String reverse = " ";
//			System.out.println("words " +rev);
//			for (int i=rev.length()-1; i>=0;i--){
//				
//				reverse= reverse + rev.charAt(i);
//				
//			}
//			mainstring=mainstring+reverse+ " "	;		
//			
//		}
//		System.out.println("main string reverse" + mainstring);
		
//		
//		int [] arr={20,2,5,9};
//		
//		int highestnumber =0;
//		int secondnumber=0;
//		
//		for (int arr1:arr){
//			
//			if (arr1 >highestnumber){
//				
//				secondnumber=highestnumber;
//				highestnumber=arr1;
//			}
//			else if (arr1 > secondnumber) {
//				
//				secondnumber=arr1;
//				
//			}
//		}
//		
//		System.out.println("highest number :" +highestnumber);
//		System.out.println("second number :" +secondnumber);
//		
//		
		
		
		int [] array ={30,10,20,4,5};
		
		for (int i=0; i<array.length;i++){
			
			System.out.println("Before sort:-  "+array[i]);
		}
		
		sort(array);
		
		
	}

	public static void sort(int [] arr1) {
		int temp;
		// TODO Auto-generated method stub
		for(int i = arr1.length-1;i>0;i--){
						
			for (int j=0; j<i;j++){
				
				if (arr1[j] > arr1[j+1]){
					
					temp= arr1[j];
					arr1[j]= arr1[j+1];
					arr1[j+1]= temp;
				}
			}
			
			
			
		}
		
		for (int i=0; i<arr1.length;i++){
			
			System.out.println("after  sort:-  "+arr1[i]);
		}
		
	}

}
