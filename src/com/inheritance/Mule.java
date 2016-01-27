package com.inheritance;

public class Mule implements IDonkey,IHorse{

	@Override
	public String runFast() {
		return " I am Mule I can run fast";
	}

	@Override
	public String heavyLoad() {
		return " I am Mule I can carry heavy load";
	}

}
