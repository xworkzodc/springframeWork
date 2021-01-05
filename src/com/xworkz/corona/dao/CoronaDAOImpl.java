package com.xworkz.corona.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.xworkz.corona.dto.CovidDTO;

public class CoronaDAOImpl implements CoronaDAO{
	
     public  CoronaDAOImpl() {
        System.out.println("created" + this.getClass().getSimpleName());
     }
 	private SessionFactory factory;

     public CoronaDAOImpl(SessionFactory factory) {
			System.out.println(this.getClass().getSimpleName() + " created...");
			this.factory = factory;
		}

	@Override
	public long save(CovidDTO dto) {
			Session session = null;
			Transaction transaction = null;
			long id=dto.getId();
			try {
				session = factory.openSession();
				transaction = session.beginTransaction();
				//session.save(dto);
				 id = (Long) session.save(dto); 
				transaction.commit();

			} catch (Exception e) {
				e.printStackTrace();
				if (transaction != null)
					transaction.rollback();

			} finally {
				if (session != null) {
					session.close();
				}
			}
			return id;
	
	}
		

}
