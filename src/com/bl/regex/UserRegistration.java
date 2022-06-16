package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean checkFirstName(String firstName) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
    }

    public boolean checkLastName(String lastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
    }

    public boolean checkEmail(String email) {
        return Pattern.matches("^(abc)[.][a-z]*[@](bl.co)(.in)$", email);
    }

    public boolean checkPhoneNumber(String phoneNumber) {
        return Pattern.matches("(91)\\s[0-9]{10}", phoneNumber);
    }

    public boolean checkValidPassword(String password) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$", password);
    }
}


