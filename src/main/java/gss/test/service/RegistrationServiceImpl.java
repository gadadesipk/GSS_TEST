package gss.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gss.test.dao.RegistrationDao;
import gss.test.model.Registration;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationDao registrationDao;
	
	@Override
	public Long saveUser(Registration registration) {
		return registrationDao.saveUser(registration);
	}

}
