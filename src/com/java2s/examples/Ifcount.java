package com.java2s.examples;

public class Ifcount {


		  public static void main(String[] arg) {
		    int value = 8;
		    int count = 10;
		    int limit = 11;

		    if (++value % 2 == 0 || ++count < limit) {
		      System.out.println("here");
		      System.out.println(value);
		      System.out.println(count);
		    }
		    System.out.println("there");
		    System.out.println(value);
		    System.out.println(count);
		  
		  
		  if (++value % 2 == 0 && ++count < limit) {
		      System.out.println("here");
		      System.out.println(value);
		      System.out.println(count);
		    }
		    System.out.println("there");
		    System.out.println(value);
		    System.out.println(count);
		  }
		}
