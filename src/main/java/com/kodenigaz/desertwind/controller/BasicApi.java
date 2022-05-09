package com.kodenigaz.desertwind.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BasicApi {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/inventory", produces = "text/plain")
    @ResponseBody
    public String inventory(HttpServletRequest request) {
        return "Ez itt az inventory";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/story", produces = "text/plain")
    @ResponseBody
    public String story(HttpServletRequest request) {
        return "Ez itt a story szövege";
    }


}
