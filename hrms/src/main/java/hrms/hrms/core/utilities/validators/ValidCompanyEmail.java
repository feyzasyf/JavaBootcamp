package hrms.hrms.core.utilities.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy= ValidCompanyEmailValidator.class)
@Target({ElementType.TYPE})
//({ElementType.TYPE})
public @interface ValidCompanyEmail {
	 String message() default "Please enter an email address with your company domain";
	    Class<?>[] groups() default {};
	    Class<? extends Payload>[] payload() default {};

}
