package Statements;

public class Switchfreeflow {

	  public static void main(String[] args) {
	    int i = 0;
	    switch (i) {

	    case 0:
	      System.out.println("i is 0");
	    case 1:
	      System.out.println("i is 1");
	    case 2:
	      System.out.println("i is 2");
	    default:
	      System.out.println("Free flowing switch example!");
	    }
	  }
	}
