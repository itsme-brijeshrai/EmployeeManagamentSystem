package com.masai.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EmployeeManagementException extends RuntimeException{
	
	 public EmployeeManagementException(String message) {
	        super(message);
	    }
}
