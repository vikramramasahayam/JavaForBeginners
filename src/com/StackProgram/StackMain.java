package com.StackProgram;

import com.StackProgram.CharStack; 
public class StackMain {

	public static void main(String[] args) {
		
		CharStack stack1=new CharStack(10);
		stack1.push('A');
		stack1.push('N');
		stack1.push('U');
		stack1.push('S');
		stack1.push('H');
		stack1.push('A');
		char val = stack1.peek();
		System.out.println(val);
		boolean x=stack1.isEmpty();
		System.out.println(x);
		char y= stack1.peek();
		System.out.println(y);
		boolean z=stack1.isFull();
		System.out.println(z);
		char a=stack1.peek();
		System.out.println(a);
		char b=stack1.peek();
		System.out.println(b);
		boolean c =stack1.isEmpty();
		System.out.println(c);
		char d=stack1.peek();
		System.out.println(d);
		boolean e= stack1.isFull();
		System.out.println(e);
		char f=stack1.peek();
		System.out.println(f);
		boolean g=stack1.isEmpty();
		System.out.println(g);
		char h=stack1.pop();
		System.out.println(h);
		char i=stack1.peek();
		System.out.println(i);
		boolean j=stack1.isEmpty();
		System.out.println(j);
		char k =stack1.pop();
		System.out.println(k);
		char l=stack1.peek();
		System.out.println(l);
		char m = stack1.pop();
		System.out.println(m);
		char n = stack1.peek();
		System.out.println(n);
		boolean p =stack1.isEmpty();
		System.out.println(p);
		 stack1.push('S');
		 stack1.push('H');
		 stack1.push('A');
		 char q= stack1.peek();
		 System.out.println(q);
		 char r=stack1.peek();
		  System.out.println(r);
		  char s =stack1.peek();
		  System.out.println(s);
		  boolean t=stack1.isFull();
		  System.out.println(t);
	}
}
		  

		  

		 

		
		
		
		
		
		
		
		
	
		
		
