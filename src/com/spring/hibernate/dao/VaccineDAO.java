package com.spring.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.dto.VaccineDTO;

import lombok.Data;
import lombok.Setter;

@Setter
public class VaccineDAO {

	private SessionFactory factory;

	public VaccineDAO(SessionFactory factory) {
		System.out.println(this.getClass().getSimpleName() + "created");
		this.factory = factory;
	}

	public void save(VaccineDTO dto) {
		Session session = null;
		Transaction tx = null;

		try {
			/*
			 * Configuration configuration = new Configuration();
			 * configuration.configure("resources/hibernate.cfg.xml"); SessionFactory
			 * factory=configuration.buildSessionFactory();
			 */

			session = factory.openSession();
			tx = session.beginTransaction();
			session.save(dto);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		} finally {
			if (session != null) {
				session.close();
			}

		}
	}
	
	public void fetchData(int vaccine_id) {
		
		Session session = null;
		Transaction tx = null;
        
		session=factory.openSession();
		session.beginTransaction();
		VaccineDTO vaccineDTO = session.get(VaccineDTO.class, vaccine_id);
		System.out.println(vaccineDTO);
		session.getTransaction().commit();
		session.close();
	}
	
	public void update(String vaccine_name, int vaccine_id) {
		Session session= null;
		Transaction tx = null;

		session =factory.openSession();
		tx=session.beginTransaction();
		VaccineDTO vaccineDTO = session.get(VaccineDTO.class, vaccine_id);
		if(vaccineDTO!=null) {
			vaccineDTO.setVaccineId(1);
			vaccineDTO.setVaccine_name("covaxin");
			session.update(vaccineDTO);
		}
		session.getTransaction().commit();
		session.close();

	}
	
	public void delete(int vaccine_id) {
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		VaccineDTO vaccineDTO = session.get(VaccineDTO.class, vaccine_id);
       if(vaccineDTO!=null) {
    	   session.delete(vaccineDTO);
       }
       session.getTransaction().commit();
       session.close();
	}
       
}
