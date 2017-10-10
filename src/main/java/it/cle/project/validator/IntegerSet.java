package it.cle.project.validator;

import it.cle.project.validator.annotation.ValidateIntegerSet;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// TODO: Auto-generated Javadoc
/**
 * The Class IntegerSet.
 */
public class IntegerSet implements ConstraintValidator<ValidateIntegerSet, Integer> {  
	  
	/** The value list. */
	private List<Integer> valueList;

    /* (non-Javadoc)
     * @see javax.validation.ConstraintValidator#initialize(java.lang.annotation.Annotation)
     */
    @Override
    public void initialize(ValidateIntegerSet constraintAnnotation) {
        valueList = new ArrayList<Integer>();
        for(int val : constraintAnnotation.acceptedValues()) {
            valueList.add(Integer.valueOf(val));
        }
    }

    /* (non-Javadoc)
     * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
     */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if(!valueList.contains(value)) {
            return false;
        }
        return true;
    }
}