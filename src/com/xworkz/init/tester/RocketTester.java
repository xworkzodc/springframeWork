package com.xworkz.init.tester;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.init.resourceSpring.RocketDAO;
import com.xworkz.init.resourceSpring.RocketDTO;

public class RocketTester {

	public static void main(String[] args) throws SQLException {
	    ApplicationContext container = new ClassPathXmlApplicationContext("resources/rocket.xml");
		RocketDTO dto =container.getBean("rocketDTO",RocketDTO.class);
        //System.out.println(dto);
       
		RocketDAO dao=container.getBean("rocketDAO",RocketDAO.class);

		//dao.save(dto);
		//dao.fetchData();
		//dao.Update(dto);
		dao.delete(dto);
		
		ClassPathXmlApplicationContext containerImpl= (ClassPathXmlApplicationContext) container;
		containerImpl.close();
	}

}
