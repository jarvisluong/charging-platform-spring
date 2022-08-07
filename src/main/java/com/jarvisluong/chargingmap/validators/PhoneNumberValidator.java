package com.jarvisluong.chargingmap.validators;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.jarvisluong.chargingmap.annotations.IsPhoneNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<IsPhoneNumber, String> {
    @Override
    public boolean isValid(String payload, ConstraintValidatorContext constraintValidatorContext) {
        try {
            PhoneNumberUtil.getInstance().parse(payload, "FI");
            return true;
        } catch (NumberParseException e) {
            return false;
        }
    }
}
