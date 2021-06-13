package sample;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub5
		
		int a[]= {3,2,1,5};
		
		int sum=0;
		int sum1=0;
		Arrays.sort(a);
		
		System.out.printf("Modified arr[] : %s",
                Arrays.toString(a));
		System.out.println("length of array is " +a.length);
		
		for (int i=0; i<a.length;i++){
			
			sum=sum+a[i];
		}
		
		System.out.println("sum is \n:" +sum);
		
		for (int j=1; j<=5; j++){
			
			 sum1= sum1+j;
		}
		System.out.println("sum is \n:" +sum1);
		
		System.out.println("Missing number is:" +(sum1-sum));

	}

}
