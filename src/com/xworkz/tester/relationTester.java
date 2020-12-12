package com.xworkz.tester;

import com.xworkz.dependencyinjectio.Battery;
import com.xworkz.dependencyinjectio.Fuel;
import com.xworkz.dependencyinjectio.Vehicle;

public class relationTester {

	public static void main(String[] args) {

		Fuel diesel = new Fuel();
		diesel.setPrice(85.90);
        diesel.setQuantity(10);
		diesel.burn();
		
		Battery battery = new Battery();
        battery.setPower(16);
        battery.setCapacity(24.00);
		//battery.charge();
		//battery.discharge();
		
		Vehicle vehicle= new Vehicle("1234", "Mary", battery);
		vehicle.setFuel(diesel);
		vehicle.start();
		
		//vehicle.
		
	}

}
