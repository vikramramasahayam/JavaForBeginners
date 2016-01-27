package com.autoboxing;

public class Scope {
	private static int x = 1; 

	   public void begin()
	   {
	      int x = 5; // method's local variable x shadows field x

	      System.out.printf( "local x in method begin is %d\n", x );

	      useLocalVariable();
	      useField();
	      useLocalVariable();
	      useField();

	      System.out.printf( "\nlocal x in method begin is %d\n", x );
	   }

	   public void useLocalVariable()
	   {
	      int x = 25; // initialized each time useLocalVariable is called

	      System.out.printf("\nlocal x on entering method useLocalVariable is %d\n", x );
	      ++x; // modifies this method's local variable x
	      System.out.printf( 
	         "local x before exiting method useLocalVariable is %d\n", x );
	   }

	   // modify class Scope's field x during each call
	   public void useField()
	   {
	      System.out.printf("\nfield x on entering method useField is %d\n", x );
	      x *= 10; // modifies class Scope's field x
	      System.out.printf("field x before exiting method useField is %d\n", x );
	   }
	}
