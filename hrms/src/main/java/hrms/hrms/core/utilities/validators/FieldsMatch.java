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
@Constraint(validatedBy= FieldsMatchValidator.class)
@Target({ElementType.TYPE})
public @interface FieldsMatch {
		String message() default "";
		String field();
		String matchingField();
		Class<?>[] groups() default {};
		Class<? extends Payload>[] payload() default {};
		
		@Target({ ElementType.TYPE })
	    @Retention(RetentionPolicy.RUNTIME)
		@Documented
	    @interface List {
	        FieldsMatch[] value();
	    }
	}


