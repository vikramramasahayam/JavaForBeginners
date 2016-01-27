package com.calculation;

public class Main {

	public static void main(String[] args) {
		int i=10;
		System.out.println(" i values inside main : "+i);
		i=add(i);
		System.out.println(" i value after add : "+i);
	}

	public static int add(int k){
		k=k+10;
		System.out.println("i values is : "+k);
		return k;
	}
}
