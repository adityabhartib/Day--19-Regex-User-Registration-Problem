package com.bridgelabz;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Validation validation=new Validation();
        System.out.println("Enter First Name : ");
        validation.checkFirstName();
        System.out.println("Enter Last Name : ");
        validation.checkLastName();
        System.out.println("Enter Email : ");
        validation.checkEmail();
        System.out.println("Enter PhoneNumber : ");
        validation.checkPhoneNumber();
        System.out.println("Enter Password as per Rule 1: ");
        validation.checkPasswordRule1();
        System.out.println("Enter Password as per Rule 2: ");
        validation.checkPasswordRule2();
        System.out.println("Enter Password as per Rule 3: ");
        validation.checkPasswordRule3();
        System.out.println("Enter Password as per Rule 4: ");
        validation.checkPasswordRule4();
        System.out.println("Enter Email : ");
        validation.checkEmail2();
    }
}
