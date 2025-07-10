package com.project.services;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TokenService {

    public String generateToken(String username) {
        // Simulate token generation using UUID
        return "token_" + username + "_" + UUID.randomUUID().toString();
    }

    public boolean validateToken(String token) {
        // Basic simulation: just checks if it starts with "token_"
        return token != null && token.startsWith("token_");
    }
}
