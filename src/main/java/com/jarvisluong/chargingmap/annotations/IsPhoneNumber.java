package com.jarvisluong.chargingmap.annotations;

import com.jarvisluong.chargingmap.validators.PhoneNumberValidator;
import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({
        ElementType.FIELD
})
@Constraint(validatedBy = PhoneNumberValidator.class)
public @interface IsPhoneNumber {
    String message() default "Must be a valid phone number.";
}
