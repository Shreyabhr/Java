package com.techlab.test;

import com.techlab.model.Bike;
import com.techlab.model.Car;
import com.techlab.model.IMovable;
import com.techlab.model.Truck;

public class IMovableTest {

	public static void main(String[] args) {
		Bike b = new Bike();
		Car c = new Car();
		Truck t = new Truck();
		IMovable [] vehicleArr= new IMovable[3];
		vehicleArr[0] = b;
		vehicleArr[1] = c;
		vehicleArr[2] = t;
		startRace(vehicleArr);

	}

	private static void startRace(IMovable[] vehicleArr) {
		for(IMovable vehicle:vehicleArr) {
			vehicle.move();
		}
		System.out.println("Race stopped");
		
	}

}
