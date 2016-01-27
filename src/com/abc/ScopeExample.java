package com.abc;

public class ScopeExample {
	
	public static void main(String[] args) {
		Box b2 = new Box(10,10);
		Box b3 = new Box(30,20,'S');
		System.out.println("H:" +b2.height +    " W:" + b2.width);
		System.out.println("H:" + b3.height +   " H:"+ b3.width +    " S:" + b3.symbol);
		change(b2);
		change(b3);
		
		System.out.println("H:" + b2.height +    " W:" + b2.width);
		System.out.println("H:" + b3.height  +   " H:" + b3.width  +   " S:" +  b3.symbol);		
	}
	public static void change(Box b){
		b.height=40;
		b.width=45;
		b.symbol='V';
		
	}

}
