package sample;

import java.util.Scanner;

public class swap_without_3variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		a=sc.nextInt();//10
		
		System.out.println("Enter 2nd  number");
		
		b=sc.nextInt();//20
		
		
		
		a=a+b;//30
		b=a-b; //10
		a=a-b;
		
		System.out.println("After swapping a=" +a  +"b "+  +b);

	}

}
