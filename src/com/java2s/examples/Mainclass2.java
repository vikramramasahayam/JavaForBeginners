package com.java2s.examples;

public class Mainclass2  {
	  boolean t;

	  char c;

	  byte b;

	  short s;

	  int i;

	  long l;

	  float f;

	  double d;

	  void print(String s) {
	    System.out.println(s);
	  }

	  void printInitialValues() {
	    print("Data type      Initial value");
	    print("boolean        " + t);
	    print("char           [" + c + "]");
	    print("byte           " + b);
	    print("short          " + s);
	    print("int            " + i);
	    print("long           " + l);
	    print("float          " + f);
	    print("double         " + d);
	  }

	  public static void main(String[] args) {
		  Mainclass2 iv = new Mainclass2();
	  iv.printInitialValues();
	   
	  }
	}
