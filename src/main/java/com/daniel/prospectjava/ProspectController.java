package com.daniel.prospectjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProspectController {
    @GetMapping("/public")
    public String publicRoute(){
        return "Olá publicRoute";
    }
    @GetMapping("/private")
    public String privateRoute(){
        return "Olá privateRoute";
    }
}
