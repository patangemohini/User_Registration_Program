package com.bridgelabz.userregistrationjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws InvalidException {
        boolean isValid = userRegistration.checkFirstName("Mohini");
        Assert.assertTrue(isValid);
    }

    @Test(expected = InvalidException.class)
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() throws InvalidException {
        boolean isValid = userRegistration.checkFirstName("Mo");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws InvalidException {
        boolean isValid = userRegistration.checkLastName("Patange");
        Assert.assertTrue(isValid);
    }

    @Test(expected = InvalidException.class)
    public void givenLastName_WhenNotProper_ShouldReturnFalse() throws InvalidException {
        boolean isValid = userRegistration.checkLastName("patange");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() throws InvalidException {
        boolean isValid = userRegistration.checkEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(isValid);
    }

    @Test(expected = InvalidException.class)
    public void givenEmail_WhenNotProper_ShouldReturnFalse() throws InvalidException {
        boolean isValid = userRegistration.checkEmail("mohini.xyz@bl.co.in");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() throws InvalidException {
        boolean isValid = userRegistration.checkPhoneNumber("91 9359492123");
        Assert.assertTrue(isValid);
    }

    @Test(expected = InvalidException.class)
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() throws InvalidException {
        boolean isValid = userRegistration.checkPhoneNumber("919359492123");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws InvalidException {
        boolean isValid = userRegistration.checkValidPassword("Patangemohi@123");
        Assert.assertTrue(isValid);
    }

    @Test(expected = InvalidException.class)
    public void givenPassword_WhenNotProper_ShouldReturnFalse() throws InvalidException {
        boolean isValid = userRegistration.checkValidPassword("patangemohi@123");
        Assert.assertFalse(isValid);
    }
}