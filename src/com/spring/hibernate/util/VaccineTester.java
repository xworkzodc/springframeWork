package com.spring.hibernate.util;

import com.spring.hibernate.dao.VaccineDAO;
import com.spring.hibernate.dto.VaccineDTO;

public abstract class VaccineTester {

	public static void main(String[] args) {

		VaccineDTO dto = new VaccineDTO();
		dto.setVaccine_name("Pfizer");
		dto.setDevelopedBy("USA");
		dto.setReadyToUse(true);
		dto.setVaccineId(1);
		
		//VaccineDAO dao = new VaccineDAO();
		//dao.save(dto);
	}

}
