package sample;

import java.util.Scanner;

public class Prime {
 
    public static void main(String[] args) {
    	
    	// 0,1,1,2,3
    int num, a= 0, b=0, c=1;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of item in series");
    num = in.nextInt();
    System.out.println("Enter number of item in series"   +num);
    
    for (int i =0; i<=num ; i++){
    	
    	a=b;
    	b=c;
    	c=a+b;
    	 System.out.println(a + "");
    			
    }
    
    
    
    
    	
    }

 
}