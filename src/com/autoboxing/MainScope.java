package com.autoboxing;

public class MainScope {

	 public static void main( String args[] )
	   {
	      {
	    	  Scope testScope = new Scope();
	    	  testScope.begin();
	      }
	      
	      System.out.println("-------");
	      Scope testScope1 = new Scope();
	      testScope1.begin();
	   }
}
