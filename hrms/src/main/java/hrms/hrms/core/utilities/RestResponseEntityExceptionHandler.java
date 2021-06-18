package hrms.hrms.core.utilities;

import java.util.HashMap;
import java.util.Map;


import org.springframework.http.HttpStatus;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import hrms.hrms.core.utilities.results.ErrorDataResult;


@RestControllerAdvice
public class RestResponseEntityExceptionHandler {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)	
	public ErrorDataResult<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exceptions){
		Map<String, String> validationErrors = new HashMap<String, String>();
		
		for(FieldError fieldError: exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "Dogrulama hatalari");
		return errors;
	
	}
	
}
