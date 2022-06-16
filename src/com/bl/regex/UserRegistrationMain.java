/*
package com.bl.regex;

import java.util.Scanner;

public class UserRegistrationMain {

    static final int FIRST_NAME = 1;
    static final int LAST_NAME = 2;
    static final int EMAIL = 3;
    static final int PHONE_NUMBER = 4;
    static final int PASSWORD = 5;
    static final int SAMPLE_EMAIL = 6;

    public static void main(String[] args) {
        System.out.println("Welcome to user registration program!!");

        UserRegistration userRegistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter choice :");
        int option = scanner.nextInt();

        switch (option) {
            case FIRST_NAME:
                userRegistration.checkFirstName("Mohini");
                break;
            case LAST_NAME:
                userRegistration.checkLastName("Patange");
                break;
            case EMAIL:
                userRegistration.checkEmail("abc.xyz@bl.co.in");
                break;
            case PHONE_NUMBER:
                userRegistration.checkPhoneNumber("91 9359492123");
                break;
            case PASSWORD:
                userRegistration.checkValidPassword("Patangemohi@123");
                break;
            case SAMPLE_EMAIL:
                EmailSample emailSample = new EmailSample();
                emailSample.checkSampleEmail();
                break;
            default:
                System.out.println("invalid option!");
                break;
        }
    }
}
*/
