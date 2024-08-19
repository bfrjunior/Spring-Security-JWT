package br.com.bfrjunior.spring_security_jwt.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("private")
public class PrivateController {

    @GetMapping
    private String getMessage() {
        return "Hello from private API controller";
    }

}
