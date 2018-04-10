package com.swt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }
}
