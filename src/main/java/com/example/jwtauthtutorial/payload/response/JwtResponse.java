package com.example.jwtauthtutorial.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@Getter
@Setter
public class JwtResponse {
    private static final String type = "Bearer";
    private String token;
    private Long id;
    private String username;
    private String email;
    private List<String> roles;
}