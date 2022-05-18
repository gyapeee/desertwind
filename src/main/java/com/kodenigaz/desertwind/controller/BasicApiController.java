package com.kodenigaz.desertwind.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Slf4j
public class BasicApiController {

    @GetMapping(value = "/inventory", produces = "text/plain")
    @ResponseBody
    public String inventory(HttpServletRequest request) {
        return "Ez itt az inventory";
    }

    @GetMapping(value = "/story", produces = "text/plain")
    @ResponseBody
    public String story(HttpServletRequest request) {
        return "Ez itt a story szövege";
    }

    @GetMapping(value = "/location", produces = "text/plain")
    @ResponseBody
    public String location(HttpServletRequest request) {
        return "Ez itt a location szövege";
    }

    @PostMapping(value = "/action")
    public Long action(@RequestBody Long id) {
        log.info("Az action id: " + id);
        return id;
    }

    @PostMapping(value = "/compassrose")
    public Long compassRose(@RequestBody Long direction) {
        log.info("A compass rose direction: " + direction);
        return direction;
    }
}
