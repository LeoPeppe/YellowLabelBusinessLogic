/*
 * 
 */
package it.cle.project.validator.annotation;

import it.cle.project.validator.IntegerSet;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// TODO: Auto-generated Javadoc
/**
 * The Interface ValidateIntegerSet.
 */
@Documented  
@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.PARAMETER,ElementType.ANNOTATION_TYPE})  
@Constraint(validatedBy=IntegerSet.class)
public @interface ValidateIntegerSet {

    /**
     * Accepted values.
     *
     * @return the int[]
     */
    int[] acceptedValues();

    /**
     * Message.
     *
     * @return the string
     */
    String message() default "Il valore inserito non è tra quelli ammissibili"; 
    //"{it.cle.project.validator.ValidateIntegerSet.message}";

    /**
     * Groups.
     *
     * @return the class[]
     */
    Class<?>[] groups() default { };

    /**
     * Payload.
     *
     * @return the class<? extends payload>[]
     */
    Class<? extends Payload>[] payload() default { }; 
}