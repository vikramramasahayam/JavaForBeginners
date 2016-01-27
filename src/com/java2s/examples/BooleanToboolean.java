package com.java2s.examples;

public class BooleanToboolean  {
	  public static void main(String[] args) {
	    boolean b = true;
	    Boolean bool = Boolean.valueOf(b);
	   
	    System.out.println("bool = " + bool);

	    if (bool.equals(Boolean.TRUE)) {
	      System.out.println("bool = " + bool);
	    }

	    String s = "false";

	    Boolean bools = Boolean.valueOf(s);
	    System.out.println("bools = " + bools);

	    String f = "abc";
	    Boolean abc = Boolean.valueOf(f);
	    System.out.println("abc = " + abc);
	  }
	}
