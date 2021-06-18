package hrms.hrms.core.utilities.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import hrms.hrms.entitites.dtos.EmployerDto;

public class ValidCompanyEmailValidator implements ConstraintValidator<ValidCompanyEmail, EmployerDto>{

	
	@Override
	public void initialize( ValidCompanyEmail constraintAnnotation) {
	    
	}
	
		@Override
		public boolean isValid(EmployerDto object, ConstraintValidatorContext context) {
			EmployerDto employer= (EmployerDto) object;
			String email = employer.getEmail();
			String website = employer.getWebsite(); 		
	 return website.contains(email.substring(email.indexOf("@") + 1)) ;
	 
	
	 
		}
	


	
	
}
