package sample;

public class FindSumOfArray {
	
	/*
	 * Sum of array elements excluding the elements which lie between a and b
Difficulty Level : Basic
Last Updated : 30 Apr, 2021
Given an array of N unique numbers. Also given two numbers a and b such that a will always be before b in the array. The task is to find the sum of the array elements excluding the elements which lie between a and b.

Examples: 

Input : arr = [2, 1, 6, 9, 11], a = 6, b = 9 
Output : 14

Input : arr = [1, 2, 4, 5, 6], a = 2, b = 5 
Output : 7
	 */

	public static void main(String[] args) {
		
		int a []= {1,3,6,3,7,9,1,5};
		
		boolean flag =true;
		int sum=0;
		for (int i:a){
			
			if (i==6)
				flag=false;
			if(flag)
				sum+=i;
			if(i==9)
				flag=true;
			
		}
System.out.println("Sum is:" +sum);
		
	}

}
