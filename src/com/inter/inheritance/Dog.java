package com.inter.inheritance;

public class Dog implements IAnimal{

	@Override
	public String getAnimalName() {
		return "Dog";
	}

	@Override
	public int getLegCount() {
		return 4;
	}

}
