package Statements;

public class Breakout  {
	  public static void main(String args[]) {

		    int len = 100;
		    int key = 50;
		    int k = 0;
		    out: {
		      for (int i = 0; i < len; i++) {
		        for (int j = 0; j < len; j++) {
		          if (i == key) {
		            break out;
		          }
		          k += 1;
		        }
		      }
		    }
		    System.out.println(k);
		  }
		}
