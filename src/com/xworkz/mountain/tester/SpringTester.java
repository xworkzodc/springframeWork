package com.xworkz.mountain.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mountain.Virus;

public class SpringTester {

	public static void main(String[] args) {

		System.out.println("starting spring engine");
		
		String configFileName ="resources/spring.xml";
		
		ApplicationContext spring = new ClassPathXmlApplicationContext(configFileName);
		Virus refOfVirus = spring.getBean(Virus.class);
		refOfVirus.virusSpeadsDiseases();
	}

}
