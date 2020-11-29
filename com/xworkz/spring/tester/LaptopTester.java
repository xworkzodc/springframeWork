package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.Laptop;

public class LaptopTester {

	public static void main(String[] args) {

		ApplicationContext spring = new ClassPathXmlApplicationContext("resources/lap.xml");
		Laptop refOfLap = spring.getBean(Laptop.class);
		Laptop twoArg=spring.getBean("hp",Laptop.class);
		Laptop twodiffArg=spring.getBean("laptopacer",Laptop.class);

		refOfLap.disply();
		
		
	}

}
