package Statements;

public class ContinueFor {

	public static void main(String[] arg) {
	    int limit = 10;
	    int sum = 0;
	    for (int i = 1; i <= limit; i++) {
	      if (i % 3 == 0) {
	        continue;
	      }
	      sum += i;
	    }
	    System.out.println(sum);
	  }

	}
