package com.xworkz.springinit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HotelTester {

	public static void main(String[] args) {

		ApplicationContext spring = new ClassPathXmlApplicationContext("resources/hotel.xml");
		Hotel refOfHotel = spring.getBean(Hotel.class);
		System.out.println(refOfHotel);
		//System.out.println(refOfHotel.getLocation());
		//System.out.println(refOfHotel.isType());
		
		//System.out.println(refOfHotel.);
		
        
	
	}

}
