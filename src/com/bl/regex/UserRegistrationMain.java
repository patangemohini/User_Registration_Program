package com.bl.regex;

import java.util.Scanner;

public class UserRegistrationMain {

    static final int FIRST_NAME = 1;
    static final int LAST_NAME = 2;
    static final int EMAIL = 3;

    public static void main(String[] args) {
        System.out.println("Welcome to user registration program!!");

        UserRegistration userRegistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter choice :");
        int option = scanner.nextInt();
            
        switch (option) {
            case FIRST_NAME:
                userRegistration.checkFirstName();
                break;
            case LAST_NAME:
                userRegistration.checkLastName();
                break;
            case EMAIL:
                userRegistration.checkEmail();
                break;
            default:
                System.out.println("invalid option!");
        }
    }
}
