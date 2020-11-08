package gss.test.service;

import org.springframework.stereotype.Service;

import gss.test.model.Registration;


public interface RegistrationService {
	
	Long saveUser(Registration registration);

}
