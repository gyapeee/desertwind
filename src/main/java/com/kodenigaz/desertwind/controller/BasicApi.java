package com.kodenigaz.desertwind.controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BasicApi {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/inventory", produces="text/plain")
    @ResponseBody
    public String inventory(HttpServletRequest request) {
        return "Ez itt az inventory";
    }

}