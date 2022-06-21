package com.koden.igaz.desertwind.controller;

import com.koden.igaz.desertwind.dto.SzovegDTO;
import com.koden.igaz.desertwind.UI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Slf4j
public class BasicApiController {

    @Autowired
    UI ui;

    @GetMapping(value = "/inventory", produces = "text/plain")
    @ResponseBody
    public String inventory(HttpServletRequest request) {
        return "Ez itt az inventory";
    }

    @GetMapping(value = "/story", produces = "text/plain")
    @ResponseBody
    public String story(HttpServletRequest request) {
        return ui.szoveg();
    }

    @GetMapping(value = "/location", produces = "text/plain")
    @ResponseBody
    public String location(HttpServletRequest request) {
        return "Ez itt a location szövege";
    }

    @PostMapping(value = "/action")
    public String action(@RequestBody String id) {
        log.info("Az action id: " + id);
        return id;
    }

    @PostMapping(value = "/compassrose")//, produces = "application/json" )
    @ResponseBody
    public SzovegDTO compassRose(@RequestBody String direction) {
        ui.parancsertelmezo(direction);
        log.info("A compass rose direction: " + direction);

        return new SzovegDTO(ui.szoveg());
    }
}
