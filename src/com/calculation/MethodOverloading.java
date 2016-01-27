package com.calculation;

public class MethodOverloading {
	public static void main(String[] args) {
	int p = 10;
	int q = 20;
	int r = 30;
	int s = 40;
	add(p,q);
	add(p,q,r);
	add(p,q,r,s);
	
	}
	public static void add(int i, int j) {
		int result = i+j;
		System.out.println("add method 1 :" +result);
		
	}
	public static void add(int i, int j,int k) {
		int result = i+j+k;
		System.out.println("add method 2 :" +result);
		
	}
	public static void add(int i, int j, int k, int l) {
		int result = i+j+k+l;
		System.out.println("add method 3 :" +result);
		
	}




}
