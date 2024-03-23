package com.daniel.prospectjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProspectController {
    @GetMapping
    public String get(){
        return "Olá";
    }
}
