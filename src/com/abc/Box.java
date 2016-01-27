package com.abc;

public class Box {
	
	public int height;
	public int width;
	public char symbol;
	
	public Box(){
		System.out.println("Zero argument constructer");
		}
	
	public Box(int h,int w){
		this.height=h;
		this.width=w;
		System.out.println("2 arguments constructer" );
		}
	public Box(int h, int w, char s){
		this.height=h;
		this.width=w;
		this.symbol=s;
		System.out.println("3 arguments constructer" );

}
}

	

	


