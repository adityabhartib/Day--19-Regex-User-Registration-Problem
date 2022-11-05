package com.bridgelabz;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Validation validation=new Validation();
        validation.checkFirstName();
        validation.checkLastName();
        validation.checkEmail();
    }
}
