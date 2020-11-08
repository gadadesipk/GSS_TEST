package gss.test.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gss.test.model.Registration;

public interface RegistrationDao {
	
	Long saveUser(Registration registration);

}
