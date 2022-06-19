package com.bridgelabz.userregistrationjunit;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSample {

    public void checkSampleEmail() {
        ArrayList<String> emailSamples = new ArrayList<>();

        emailSamples.add("abc@yahoo.com");
        emailSamples.add("abc-100@yahoo.com");
        emailSamples.add("abc.100@yahoo.com");
        emailSamples.add("abc111@abc.com");
        emailSamples.add("abc-100@abc.net");
        emailSamples.add("abc.100@abc.com.au");
        emailSamples.add("abc@1.com");
        emailSamples.add("abc@gmail.com.com");
        emailSamples.add("abc+100@gmail.com");

        emailSamples.add("abc");
        emailSamples.add("abc@.com.my");
        emailSamples.add("abc123@gmail.a");
        emailSamples.add("abc123@.com");
        emailSamples.add("abc123@.com.com");
        emailSamples.add(".abc@abc.com");
        emailSamples.add("abc()*@gmail.com");
        emailSamples.add("abc@%*.com");
        emailSamples.add("abc..2002@gmail.com");
        emailSamples.add("abc.@gmail.com");
        emailSamples.add("abc@abc@gmail.com");
        emailSamples.add("abc@gmail.com.1a");
        emailSamples.add("abc@gmail.com.aa.au");

        String regex = "^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$";
        Pattern pattern = Pattern.compile(regex);

        for (String str : emailSamples) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("Valid email : " + str + " : " + matcher.matches());
            } else {
                System.out.println("Invalid email : " + str + " : " + matcher.matches());
            }
        }
    }
}
