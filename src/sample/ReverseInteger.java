package sample;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =12345;
		int rev=0;
		
		while(num!=0){
			
			rev= rev*10+ num%10;
			num=num/10;
		}
		
		System.out.println("Reverse num is ::"+rev);
		
		
		//2nd solution:using string buffer
		int  num1=12345;
		System.out.println( new StringBuffer(String.valueOf(num1)).reverse());
		
		//3rd solution:
		
		int num2 =1230;
		
		String s = String.format("%05d", num2);
		
		System.out.println("formatted string is " +s);
		
		String rev1="";
		for (int i=s.length()-1; i>=0; i--){
			
			rev1= rev1+s.charAt(i);
			
			
		}
		System.out.println("reverese" +rev1);
		

	}

}
