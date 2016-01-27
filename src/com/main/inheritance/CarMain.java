package com.main.inheritance;

import com.inheritance.ICar;

public class CarMain {

	public static void main(String[] args) {
		ICar car = new Honda();
		car.getCarName();
		car.getTitle();
		car.getMake();
		
		((Honda)car).getModel();
	}

}
