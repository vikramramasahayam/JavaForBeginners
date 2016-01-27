package com.StackProgram;

public class StaticProgram {

	public static void main(String[] args) {
		System.out.println(CharStack.getInstanceCount());
		
		CharStack stack1 =new CharStack(10);
		CharStack stack2 = new CharStack(5);
		CharStack stac3 = new CharStack(6);

		System.out.println(CharStack.getInstanceCount());
		
		
		
		
		
	}

}
