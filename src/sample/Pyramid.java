package sample;

import java.util.Scanner;

public class Pyramid {

	  public static void main(String[] args) {
	    int n = 4;
//
//	    for (int i = 1; i <= rows; ++i) {
//	      for (int j = 1; j <= i; ++j) {
//	        System.out.print("# ");
//	      }
//	      System.out.println();
//	    }
	    
//	    //If (row index + column index) > n, print “#”; otherwise, print ” “.
//	    for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <= n; j++) {
//                if ((i + j) > n) {
//                    System.out.print("#");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
		  
//	    for(int i=1;i<=n;i++){
//            for (int j=1; j<=n;j++){
//            	
//                if((i+j)>n){
//                	
//                    System.out.println("#");
//                    
//                }else{
//                      System.out.println(" ");
//                  }                 
//            }
//            System.out.println();
//        }
/*	    
    #
   ##
  ###
 ####
 3 loops : i= for row j= space k= for column #.

	     */
	    
	    for (int i=1; i<=4; i++){
	    	
	    	for (int j=3;j>=i;j--){
	    		
	    		System.out.print(" ");
	    	}
	    	
	    	for (int k=1;k<=i; k++){
	    		
	    		System.out.print("#");
	    		
	    	}
	    	System.out.println();
	    }
	    System.out.println("----------------------------------New Pattern Traingle--------------------------");
	    
	    /*	    
	    #
	   # #
	  # # #
	 # # # #
	 3 loops : i= for row j= space k= for column #.

		     */
		    
		    for (int i=1; i<=4; i++){
		    	
		    	for (int j=3;j>=i;j--){
		    		
		    		System.out.print(" ");
		    	}
		    	
		    	for (int k=1;k<=i; k++){
		    		
		    		System.out.print(" #");   // Same as above program -> just need to add  extra space before #.
		    		
		    	}
		    	System.out.println();
		    }
		    
		    System.out.println("----------------------------------New Pattern Alphabet  with Ascii  value--------------------------");
	    /*
	     *  A 
			A B 
			A B C 
			A B C D 
			A B C D E 
			A B C D E F 

	     *  i= row 0 to 5 j= column 0 to6  Ascii value A=65 B=66; c-67
	     * 
	     */
		int alpha = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print((char) (alpha + j)+ " ");//// alpha=65+0 and typcasted to char so that it will print char for Ascii value of 65 i.e A

			}
			System.out.println();

		}
		
	    System.out.println("----------------------------------New Pattern Alphabet  with Ascii  value--------------------------");
	    /*
	     *  A 
			B B 
			C C C 
			D D D D 
			E E E E E 
			F F F F F F  

	     *  i= row 0 to 5 j= column 0 to6  Ascii value A=65 B=66; c-67
	     *  A-Z= 65 to 90;
	     *  a-z= 97-122
	     * 
	     */
		int alpha1 = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha1)+ " ");//// alpha=65 and typcasted to char so that it will print char for Ascii value of 65 i.e A
			}
			alpha1++;
			System.out.println();

		}


  }
	}
