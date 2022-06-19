package com.bridgelabz.userregistrationjunit;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean checkFirstName(String firstName) throws InvalidException {
        boolean isValid = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
        if (!isValid) {
            System.out.println("First name is not valid");
            throw new InvalidException("Invalid");
        }
        System.out.println("First name is valid");
        return true;
    }

    public boolean checkLastName(String lastName) throws InvalidException {
        boolean isValid = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
        if (!isValid) {
            System.out.println("Last name is not valid");
            throw new InvalidException("Invalid");
        }
        System.out.println(" Last name is valid");
        return true;
    }

    public boolean checkEmail(String email) throws InvalidException {
        boolean isValid = Pattern.matches("^(abc)[.][a-z]*[@](bl.co)(.in)$", email);
        if (!isValid) {
            System.out.println("Email is not valid ");
            throw new InvalidException("Invalid");
        }
        System.out.println("Email is valid");
        return true;
    }

    public boolean checkPhoneNumber(String phoneNumber) throws InvalidException {
        boolean isValid = Pattern.matches("(91)\\s[0-9]{10}", phoneNumber);
        if (!isValid) {
            System.out.println("Phone number is not valid ");
            throw new InvalidException("Invalid");
        }
        System.out.println("Phone number is valid");
        return true;
    }

    public boolean checkValidPassword(String password) throws InvalidException {
        boolean isValid = Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$", password);
        if (!isValid) {
            System.out.println("Password is not valid ");
            throw new InvalidException("Invalid");
        }
        System.out.println("Password is valid");
        return true;
    }

    public boolean validMail(String email) throws InvalidException {
        boolean isValid = Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
        if (!isValid) {
            System.out.println("Separated email is not valid");
            throw new InvalidException("Invalid");
        }
        System.out.println("Separated email is valid");
        return true;
    }
}


