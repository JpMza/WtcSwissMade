package com.wtc.swissmade.swm.dao;

import com.wtc.swissmade.swm.models.Queries;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QueriesDaoImpl implements QueriesDao  {


	private SessionFactory sessionFactory;

	public void addQuery(Queries queries) {
		Session session = sessionFactory.openSession();
		session.save(queries);
		session.close();
	}

}
