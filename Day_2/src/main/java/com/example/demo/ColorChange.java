package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorChange {
    private String favouritecolor="my favourite color";
    @GetMapping
    public String getMyFav()
    {
        return "My favorite color is "+favouritecolor;
    }
}