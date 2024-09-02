package org.example.tutoriajavag5.application.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/simple")
public class SimpleController {

    @GetMapping("/find")
    public String hello()
    {
        return "Hello world";
    }
}
