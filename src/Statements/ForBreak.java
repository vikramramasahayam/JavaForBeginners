package Statements;

public class ForBreak {
//	 public static void main(String args[]) {
//		    int sum = 0;
//		    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//		    // Use for to display and sum the values.
//		    for (int x : nums) {
//		      System.out.println("Value is: " + x);
//		      sum += x;
//		      if (x == 5){
//		        break; // stop the loop when 5 is obtained
//		      }
//		    }
//		    System.out.println("Summation of first 5 elements: " + sum);
//		  }
//		}
	
	  public static void main(String[] args) {

		    OuterLoop: for (int i = 2;; i++) {
		      for (int j = 2; j < i; j++) {
		        if (i % j == 0) {
		          continue OuterLoop;
		        }
		      }

		      System.out.println(i);
		      if (i == 107) {
		        break;
		      }
		    }
		  }
}

