package com.inter.inheritance;

public class Horse implements IAnimal{

	@Override
	public String getAnimalName() {
		return "Horse";
	}

	@Override
	public int getLegCount() {
		return 3;
	}

}
