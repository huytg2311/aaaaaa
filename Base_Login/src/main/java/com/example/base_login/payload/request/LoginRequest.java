package com.example.base_login.payload.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class LoginRequest {

    private String username;

    private String email;

    private Set<String> role;

    private String password;

}
