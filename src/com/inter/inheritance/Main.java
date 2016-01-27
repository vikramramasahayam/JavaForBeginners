package com.inter.inheritance;

public class Main {

	public static void main(String[] args) {

		IAnimal animal = new Dog();
		
		System.out.println(animal.getAnimalName());
		
		animal = new Horse();
		
		System.out.println(animal.getAnimalName());
	}

}
