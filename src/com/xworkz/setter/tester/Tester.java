package com.xworkz.setter.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.setter.init.Mobile;
import com.xworkz.setter.init.Monitor;
import com.xworkz.setter.init.Xworkz;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext spring = new ClassPathXmlApplicationContext("resources/xworkz.xml");
		//Mobile refOfMobile= spring.getBean(Mobile.class);
		//System.out.println(refOfMobile);
		//System.out.println(refOfMobile.isLteSupported());
		
		//Monitor monitor=spring.getBean(Monitor.class);
		//System.out.println(monitor);
		//System.out.println(monitor.getMfgDate());
		//System.out.println(monitor.getModelNo());
		
		Xworkz inst=spring.getBean(Xworkz.class);
		System.out.println(inst);
	}

}
