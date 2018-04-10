package com.swt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringSecurityApplication {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello!!!";
    }

    @GetMapping("/user")
    @ResponseBody
    public String user() {
        return "Hello user!!!";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/auth/info")
    @ResponseBody
    public Authentication me(Authentication authentication) {
        return authentication;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }
}
