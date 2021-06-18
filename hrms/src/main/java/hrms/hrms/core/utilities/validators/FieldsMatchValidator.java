package hrms.hrms.core.utilities.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapperImpl;

public class FieldsMatchValidator  implements ConstraintValidator<FieldsMatch, Object>{

	private String field;
	private String matchingField;
	private String message;
	
	  @Override
	    public void initialize(final FieldsMatch constraintAnnotation) {
		    	this.field = constraintAnnotation.field();
		    	this.matchingField = constraintAnnotation.matchingField();
	        message = constraintAnnotation.message();
	    }

	    @Override
	    public boolean isValid(final Object value, final ConstraintValidatorContext context) {
	        boolean valid = true;
	        try
	        {
	            final Object firstObj = new BeanWrapperImpl(value).getPropertyValue(field);
	            final Object secondObj = new BeanWrapperImpl(value).getPropertyValue(matchingField);

	            valid =  firstObj == null && secondObj == null || firstObj != null && firstObj.equals(secondObj);
	        }
	        catch (final Exception ignore)
	        {
	            // we can ignore
	        }

	        if (!valid){
	            context.buildConstraintViolationWithTemplate(message)
	                    .addPropertyNode(field)
	                    .addConstraintViolation()
	                    .disableDefaultConstraintViolation();
	        }

	        return valid;
	    }
}
