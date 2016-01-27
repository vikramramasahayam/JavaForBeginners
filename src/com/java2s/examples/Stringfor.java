package com.java2s.examples;

public class Stringfor  {

	  public static void main(String[] args) {
	    String str = "Abcdefg";
	    char[] cArray = str.toCharArray();

	    for (char c : cArray)
	      System.out.println(c);
	  }
}
