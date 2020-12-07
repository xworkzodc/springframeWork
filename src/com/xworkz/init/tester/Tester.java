package com.xworkz.init.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.init.resourceSpring.DatabaseObject;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		DatabaseObject db= container.getBean(DatabaseObject.class);
		db.save();
		db.closeResources();//manually closing resources
		
		//ClassPathXmlApplicationContext impl = (ClassPathXmlApplicationContext) container;
		//impl.close();
		

	}

}
