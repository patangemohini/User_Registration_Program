package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public void checkFirstName(){
        System.out.println("Enter First name starts with Cap and has minimum 3 characters: ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("^[A-Z][a-z]{2,}$" , firstName));

    }
}
