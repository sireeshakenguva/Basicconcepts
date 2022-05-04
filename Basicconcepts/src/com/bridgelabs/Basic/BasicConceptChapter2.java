package com.bridgelabs.Basic;

public class BasicConceptChapter2 {
      public static void main(String[] args) {
    	  int x = 20;
    	  
    	  //we want to check whether this number is even or not
    	  
    	  /**
    	   * even number -> if completly divisible by 2
    	   */
    	   
    	  /**
    	   
    	    
    	    int y = 18;
    	    System.out.println(y / 3); //6
    	    System.out.println(y % 3); //0 => y: 18
    	    /**
    	     * Algorithm:
    	     * step 1 > we have to check the number is completely divisible by 2
    	     * step 2 > if else
    	     */
    	    
    	    // x + y = 30 proof
    	    if (x % 2 == 0) {     
    	    	System.out.println("divisible by 2");
    	     } else if (x % 3 == 0) {
    	    	 
    	    	System.out.println("divisible by 3");
    	     } else if (x % 4 == 0) {
    	     
    	        System.out.println("divisible by 4");
    	     } else if (x % 5 == 0) {
    	    
    	    	System.out.println("divisible by 6");
    	    } else {
    	    	System.out.println("else");
    	    }
}
}