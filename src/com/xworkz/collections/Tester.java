package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("resources/animal.xml");
		Animals  animals = container.getBean(Animals.class);
		
		ArrayList<String> dAnimals= animals.getDomesticAnimals();
		System.out.println(dAnimals);
		
		TreeSet<String> wAnimals= animals.getWildAnimals();
		System.out.println(wAnimals);
		
	}
		
}


