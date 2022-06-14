package com.kodenigaz.desertwind.controller;

import com.kodenigaz.desertwind.service.UserStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BasicApi {

    @Autowired
    private UserStateService userStateService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/inventory", produces = "text/plain")
    @ResponseBody
    public String inventory(HttpServletRequest request) {
        userStateService.list().forEach(System.out::println);
        return "Ez itt az inventory";
    }

}
