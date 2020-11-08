package gss.test.exception;

import java.util.List;

public class GssException {
	
	private List<String> errors;

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public GssException(List<String> errors) {
		super();
		this.errors = errors;
	}
	
	
	
}
