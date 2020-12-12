package com.xworkz.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dependencyinjectio.Vehicle;

public class DiTester {

	public static void main(String[] args) {

		
		try(ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("resources/di.xml")){
		
			container.getBean(Vehicle.class).start();
			//vehicle.start();
		}
	}

}
