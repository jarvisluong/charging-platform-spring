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
            var phoneNumberUtil = PhoneNumberUtil.getInstance();
            var phoneNumber = phoneNumberUtil.parse(payload, "FI");
            return phoneNumberUtil.isValidNumber(phoneNumber);
        } catch (NumberParseException e) {
            return false;
        }
    }
}
