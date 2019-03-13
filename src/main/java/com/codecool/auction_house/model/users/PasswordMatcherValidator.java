package com.codecool.auction_house.model.users;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatcherValidator
        implements ConstraintValidator<PasswordMatcher, Object> {

    @Override
    public void initialize(PasswordMatcher constraintAnnotation) {
    }
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context){
        NewRegisteredUser user = (NewRegisteredUser) obj;
        return user.getPassword().equals(user.getMatchingPassword());
    }
}