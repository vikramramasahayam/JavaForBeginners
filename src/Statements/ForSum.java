package Statements;

public class ForSum {
	 public static void main(String args[]) { 
		    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
		    int sum = 0; 

		    for(int i=0;i<10;i++){
		    	sum =sum+nums[i];
		    	System.out.println(sum);
		    
		    }
		    // use for-each style for to display and sum the values
//		    for(int x : nums) { 
//		      System.out.println("Value is: " + x);
//		      sum += x; 
//		    } 

		    System.out.println("Summation: " + sum);
		  } 
		}


