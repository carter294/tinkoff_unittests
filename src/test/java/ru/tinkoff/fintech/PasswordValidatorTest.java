package ru.tinkoff.fintech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {
    @Test
    public void withoutUpperCaseCharsTest() {
        PasswordValidator p = new PasswordValidator();
        Assertions.assertEquals("Password must have atleast one uppercase character", p.validatePassword("wehfk2354dfk@"));
    }

    @Test
    public void withoutLowerCaseCharsTest() {
        PasswordValidator p = new PasswordValidator();
        Assertions.assertEquals("Password must have atleast one lowercase character", p.validatePassword("DGFF@G71254FKJ"));
    }

    @Test
    public void withoutSpecialCharsTest() {
        PasswordValidator p = new PasswordValidator();
        Assertions.assertEquals("Password must have atleast one special character among @#$%", p.validatePassword("DGFewgG754FKJ"));
    }

    @Test
    public void withoutNumbersTest() {
        PasswordValidator p = new PasswordValidator();
        Assertions.assertEquals("Password must have atleast one number", p.validatePassword("DGFewgG#FKJ"));
    }

    @Test
    public void lengthTooLongTest() {
        PasswordValidator p = new PasswordValidator();
        Assertions.assertEquals("Password must be less than 20 and more than 8 characters in length", p.validatePassword("catcatcatcatcatc"));
    }

    @Test
    public void lengthTooShortTest() {
        PasswordValidator p = new PasswordValidator();
        Assertions.assertEquals("Password must be less than 20 and more than 8 characters in length", p.validatePassword("catcatc"));
    }

    @Test
    public void validPasswordTest() {
        PasswordValidator p = new PasswordValidator();
        Assertions.assertEquals("password is valid", p.validatePassword("ewf214VUF@"));
    }
}