package com.spring.hibernate.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.dto.VaccineDTO;

public class VaccineDAO {

	SessionFactory factory=null;
	
	public void save(VaccineDTO dto) {
		Session session = null;
		Transaction tx =null;
		try{
			Configuration configuration = new Configuration();
		    configuration.configure("resources/hibernate.cfg.xml");
		    SessionFactory factory=configuration.buildSessionFactory();
		    session=factory.openSession();
		    tx=session.beginTransaction();
		    session.save(dto);
		    tx.commit();   
		}catch(Exception e) {
			e.printStackTrace();
			if(tx!=null) 
				tx.rollback();
		 } finally {
				if(session!=null){
					session.close();
			     }
			    	if(factory!= null) {
				    	factory.close();
				    }
				
			     }
	}
}
		
		
	
		
		


