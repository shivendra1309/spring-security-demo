package com.shiv.spring_security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String matchingPassword;
}
