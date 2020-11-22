package com.xworkz.mountain;

import java.io.FileReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Currency;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaClasses {

	public static void main(String[] args) {

		System.out.println("Starting spring Engine");
		
		String configFileName= "resources/df.xml";
		
		ApplicationContext spring = new ClassPathXmlApplicationContext(configFileName);
		
		String string = spring.getBean(String.class);
		Scanner scan =spring.getBean(Scanner.class);
		Collections collection =spring.getBean(Collections.class);
		ArrayList al= spring.getBean(ArrayList.class);
		Arrays array = spring.getBean(Arrays.class);
		Exception exception = spring.getBean(Exception.class);
		Currency currency = spring.getBean(Currency.class);
		Thread thread= spring.getBean(Thread.class);
		Calendar calender = spring.getBean(Calendar.class);
		Date dt = spring.getBean(Date.class);
		FileReader fr=spring.getBean(FileReader.class);

		
	}
	

}
