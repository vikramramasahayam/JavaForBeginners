package com.calculation;

public class Operations {

	public static void main(String[] args) {
		int i=5;
		int j=10;
		add(i,j);
		subtraction(i,j);
		multiplication(i,j);
		divison(i,j);
		modulus(i,j);
		increment(i);
		decrement(j);
		equalto(i,j);
		notequalto(i,j);
		greaterthan(i,j);
		lessthan(i,j);
		greaterthanorequalto(i,j);
		lessthanorequalto(i,j);
		bitwiseand(1,3);
		bitwiseor(i,j);
			bitwisexor(i,j);
			bitwisecomplement(j);
			leftshift(i,j);
			rightshift(i,j);
			logicalnot(true);
//		zerofillrightshift(i,j);
			logicaland(true,false);
			logicalor(true,false);
		
			
		
		 System.out.println("-----Done----");
	}
	
	public static void add(int x,int y){
		int z = x+y;
		System.out.println("add method : "+z);
	}
	
	public static void subtraction(int p, int q) {
		int r = p-q;
		System.out.println("sub method :"+r);
		
	}
	
	public static void multiplication(int a, int b){
		int c = a*b;
		System.out.println("mul method :"+c);
	}
	public static void divison(int m, int n){
		int s = m/n;
		System.out.println("divison method :"+s);
	} 
	public static void modulus(int e, int f){
	     int g = e%f;
	     System.out.println("modulus method :"+g);		
	}
	public static void increment(int k){
		int h = ++k;
		System.out.println(" Increment Method : "+h);
	}
	public static void decrement(int l){
		int t = --l;
		System.out.println("decrement method :"+t);
	}
	public static void equalto(int p,int q){
		boolean results = (p==q);
		System.out.println("equal to method :"+results);
		}
	public static void notequalto(int a, int b){
		boolean results = (a!=b);
		System.out.println("notequalsto method :" +results);
	}
	public static void greaterthan(int a, int b){
		boolean results = (a>b);
		System.out.println("greaterthan method :" +results);
	}
	public static void lessthan(int a, int b){
		boolean results = (a<b);
		System.out.println("lessthan method :" +results);
		
	}
	public static void greaterthanorequalto(int a, int b){
		boolean results = (a>=b);
		System.out.println("greaterthanorequalto method :" +results);
		
	}
	public static void lessthanorequalto(int a, int b){
		boolean results = (a<=b);
		System.out.println("lessthanorequalto method :" +results);
		
	}
	public static void bitwiseand(int a, int b){
		int results = (a&b);
		System.out.println("bitwiseand method :" +results);
		
	}
	public static void bitwiseor(int a, int b){
		int results = (a|b);
		System.out.println("bitwiseor method :" +results);
		
	}
	public static void bitwisexor(int a, int b){
		int  results = (a^b);
		System.out.println("bitwisexor method :" +results);
		
	}
	

	public static void bitwisecomplement( int b){
		int results = (~b);
		System.out.println("bitwisecomplement method :" +results);
		
	}
	public static void leftshift(int a, int b){
		int results = (a<<b);
		System.out.println("leftshift method :" +results);
		
	}
	public static void rightshift(int a, int b){
		int results = (a>>b);
		System.out.println("rightshift method :" +results);
		
	}
	public static void logicalnot(boolean flag){
		boolean results = !flag;
		System.out.println("logicalnot method :" +results);
		
	}
	
	/*public static void zerofillrightshift( int a , int b){
	boolean results = (a>>>b);
		System.out.println("zer0fillrightshift method :" +results);
		
	}*/
	public static void logicaland(boolean i , boolean j){
		boolean results = (i&&j);
		System.out.println("logicaland method :" +results);
	}
	
	public static void logicalor(boolean a,boolean b ){
		boolean results = (a||b);
		System.out.println("logicalor method :" +results);
		
	}
}
