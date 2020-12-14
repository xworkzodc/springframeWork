package com.spring.hibernate.util;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.spring.hibernate.dao.VaccineDAO;
import com.spring.hibernate.dto.VaccineDTO;

public class SpringTester {

	public static void main(String[] args) {
		
		
//		DataSource datasource = new DriverManagerDataSource();
//		DriverManagerDataSource datasource2 = (DriverManagerDataSource) datasource;
//		datasource2.setUrl("");
//		datasource2.setPassword("");
//		datasource2.setUsername("");
//		datasource2.setDriverClassName("");
	
		

		try(ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("resources/spring.xml")){
		VaccineDAO dao = container.getBean(VaccineDAO.class);

		VaccineDTO dto = new VaccineDTO();
		dto.setVaccineId(5);
		dto.setVaccine_name("PFizer");
		dto.setDevelopedBy("USA");
		dto.setReadyToUse(true);
		// dto.setVaccineId(1);

		dao.save(dto);
		//dao.fetchData(2);
		//dao.update("covaxin", 1);
		dao.delete( 1);

	}
  }

}
