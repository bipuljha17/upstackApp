package org.upgrad.upstac.auth.register;


import lombok.*;
import org.upgrad.upstac.users.models.Gender;

@Data
public class RegisterRequest {


    private String userName;

    private String password;
    private String firstName;

    private String email="";

    private String phoneNumber="";


    private String lastName;

    private String address;

    private Integer pinCode;


    private String dateOfBirth;


    private Gender gender;



}
