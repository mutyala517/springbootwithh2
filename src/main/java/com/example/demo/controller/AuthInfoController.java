package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthInfoController {
    @Value("${security.user.name}")
    private String username;

    @Value("${security.user.password}")
    private String password;

    @GetMapping("/auth/info")
    public Map<String, String> getAuthInfo() {
        Map<String, String> authInfo = new HashMap<>();
        authInfo.put("username", username);
        authInfo.put("password", password);
        return authInfo;
    }
}
