package gss.test.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ExceptionHandler extends ResponseEntityExceptionHandler{
	
	
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<String> errors=new ArrayList();
		List<FieldError> fieldErrors=((MethodArgumentNotValidException) ex).getBindingResult().getFieldErrors();
		for (FieldError fieldError:fieldErrors) {
			errors.add(fieldError.getDefaultMessage());
		}
		GssException gssException= new GssException(errors);
		return new ResponseEntity(errors,HttpStatus.BAD_REQUEST);
	}

}
