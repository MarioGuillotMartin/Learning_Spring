package com.learningSpring.Clothes_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mapping_REST {

    @GetMapping("/")
   void clothes(){

    }

}
