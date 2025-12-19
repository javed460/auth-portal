package com.example.authportal.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Auth Portal - Go to /dashboard to login";
    }

    @GetMapping("/dashboard")
    public Map<String, Object> dashboard(@AuthenticationPrincipal OidcUser user) {
        return Map.of(
                "message", "Welcome to Dashboard",
                "user", user.getSubject(),
                "username", user.getPreferredUsername(),
                "email", user.getEmail(),
                "claims", user.getClaims()
        );
    }

    @GetMapping("/public/info")
    public String publicInfo() {
        return "This is public information";
    }
}