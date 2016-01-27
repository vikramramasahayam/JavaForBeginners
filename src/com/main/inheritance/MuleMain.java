package com.main.inheritance;

import com.inheritance.IDonkey;
import com.inheritance.IHorse;
import com.inheritance.Mule;

public class MuleMain {

	public static void main(String[] args) {
		IHorse horse = new Mule();
		String messag=horse.runFast();
		System.out.println(messag);
		
		IDonkey donkey = new Mule();
		String message=donkey.heavyLoad();
		System.out.println(message);
		
		((Mule)horse).heavyLoad();
		
		((Mule)donkey).runFast();
	}

}
