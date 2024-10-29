package org.springframework.samples.petclinic.system;

public class CustomControllerException extends RuntimeException {

	public CustomControllerException(String message) {
		super(message);
	}

}
