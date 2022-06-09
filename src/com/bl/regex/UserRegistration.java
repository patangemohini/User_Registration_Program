package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public void checkFirstName() {
        System.out.println("Enter First name starts with Cap and has minimum 3 characters: ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("^[A-Z][a-z]{2,}$", firstName));
    }

    public void checkLastName() {
        System.out.println("Enter last name starts with Cap and has minimum 3 characters: ");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("^[A-Z][a-z]{2,}$", lastName));
    }

    public void checkEmail() {
        System.out.print("Enter email Id : ");
        String email = scanner.next();
        System.out.println(Pattern.matches("^(abc)[.]{1}[a-z]*[@]{1}(bl.co)(.in)$", email));
    }

    public void checkPhoneNumber() {
        System.out.print("Enter phone number : ");
        String phoneNumber = scanner.next();
        System.out.println(Pattern.matches("(91)[0-9]{10}", phoneNumber));
    }

    public void checkValidPassword() {
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$", password));
    }
}

