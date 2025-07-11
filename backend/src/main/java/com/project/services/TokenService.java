package com.project.services;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

/**
 * Service for generating and validating JWT tokens.
 */
@Service
public class TokenService {

    // Secret key for signing tokens (use a secure key in production)
    private static final Key SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    // Token validity duration (e.g., 1 hour)
    private static final long EXPIRATION_TIME_MS = 60 * 60 * 1000;

    /**
     * Generates a JWT token containing the user's email.
     */
    public String generateToken(String email) {
        Date now = new Date();
        Date expiry = new Date(now.getTime() + EXPIRATION_TIME_MS);

        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(now)
                .setExpiration(expiry)
                .signWith(SECRET_KEY)
                .compact();
    }

    /**
     * Validates the JWT token and returns the email if valid.
     */
    public String validateToken(String token) {
        try {
            Jws<Claims> claims = Jwts.parserBuilder()
                    .setSigningKey(SECRET_KEY)
                    .build()
                    .parseClaimsJws(token);

            return claims.getBody().getSubject(); // returns email
        } catch (JwtException e) {
            // Token is invalid or expired
            return null;
        }
    }
}
