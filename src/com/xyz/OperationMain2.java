package com.xyz;
       
import com.abc.Operation2;
public class OperationMain2 {

	public static void main(String[] args) {
		int p=5;
		int q=20;
	
		Operation2 opr=null;
		opr=new Operation2();
		final int l=opr.add(p,q);
		System.out.println(l);
		

	}

}
