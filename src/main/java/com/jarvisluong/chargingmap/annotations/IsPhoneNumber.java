package com.jarvisluong.chargingmap.annotations;

import com.jarvisluong.chargingmap.validators.PhoneNumberValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({
        ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneNumberValidator.class)
public @interface IsPhoneNumber {
    String message() default "Must be a valid phone number.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
