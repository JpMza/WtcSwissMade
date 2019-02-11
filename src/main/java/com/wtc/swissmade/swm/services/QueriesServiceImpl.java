package com.wtc.swissmade.swm.services;

import com.wtc.swissmade.swm.dao.QueriesDao;
import com.wtc.swissmade.swm.models.Queries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueriesServiceImpl implements QueriesService {

	@Autowired
	private QueriesDao queryDao;

	public void addQuery(Queries queries) {

		queryDao.addQuery(queries);
	}

}
