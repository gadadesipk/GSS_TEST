package gss.test.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gss.test.model.Registration;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {
	
	@Autowired
	private SessionFactory session;

	@Override
	public Long saveUser(Registration registration) {
		return(Long) session.getCurrentSession().save(registration);
	}

}
