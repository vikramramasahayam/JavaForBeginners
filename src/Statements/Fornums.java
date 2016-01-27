package Statements;

public class Fornums {

//	public static void main(String args[]) {
//	    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	 
//	    for(int x : nums) {
//	      System.out.print(x + " "); 
//	      x = x * 10; // no effect on nums
//	    }
//	   
//	    System.out.println();
//
//	    for(int x : nums) 
//	      System.out.print(x + " "); 
//
//	    System.out.println();
//	  }  
	
//	 enum Season {
//		    spring, summer, fall, winter
//		  }
//
//		  public static void main(String[] args) {
//		    for (Season season : Season.values()) {
//		      System.out.println(" The season is now " + season);
//		    }
//		  }
//		}
	  public static void main(String args[]) {
		    int sum = 0;
		    int nums[][] = new int[3][5];

		    // give nums some values
		    for (int i = 0; i < 3; i++){
		    	
		    	
		      for (int j = 0; j < 5; j++){
		    	  
		        nums[i][j] = (i + 1) * (j + 1);
		    } 
		    }
		    
		    for(int i=0;i<3;i++){
		    	for(int j=0;j<5;j++){
		    		sum =sum+nums[i][j];
		    	}
		    }
		    /*// use for-each for to display and sum the values
		    for (int x[] : nums) {
		      for (int y : x) {
		        System.out.println("Value is: " + y);
		        sum += y;
		      }
		    }*/
		    System.out.println("Summation: " + sum);
		  }
}
	
	
	
	
	
	
