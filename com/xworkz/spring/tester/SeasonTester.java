package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.Season;

public class SeasonTester {

	public static void main(String[] args) {

		ApplicationContext spring= new ClassPathXmlApplicationContext("resources/season.xml");
		Season refOfSeason= spring.getBean(Season.class);
		System.out.println(refOfSeason);
	}

}
