package com.local_test.keycloack;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class DemoController {

    @GetMapping
    @PreAuthorize("hasRole('role_desiered_A')")
    public String hello() {
        return "hello from spring boot ans keycloak - you are recognised as a role_desiered_A";
    }

    @GetMapping("/hello-2")
    @PreAuthorize("hasRole('role_desiered_B')") //role defined in the keycloak installation.
    public String hello2() {
        return "hello from spring boot ans keycloak - you are recognised as a role_desiered_B";
    }
}
