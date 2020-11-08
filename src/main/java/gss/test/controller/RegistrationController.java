package gss.test.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import gss.test.model.Registration;
import gss.test.service.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;
	
	@ResponseBody
	@RequestMapping(value = "/register",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveUser(@Valid @RequestBody Registration registration) {
		System.err.println("data"+registration.toString());
		Long registration1=	registrationService.saveUser(registration);
		return new ResponseEntity("REGISTRATION SUCCESS FULL",HttpStatus.OK);
	}
	
	@RequestMapping(value = "/")
	public String registrationForm() {
		return "registration";
	}

}
