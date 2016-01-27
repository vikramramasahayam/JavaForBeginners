package Statements;

public class ForIf {
//	 public static void main(String[] args) {
//		    int m = 0;
//		    for (;;) {
//		      System.out.println(m);
//		      m++;
//		      if (m > 4) {
//		        break;
//		      }
//		    }
//		  }
	 public static void main(String[] arg) {
		    int limit = 10;
		    int sum = 0;

		    for (int i = 1; i <= limit;) {
		      sum += i++;
		    }
		    System.out.println(sum);
		  }
}
