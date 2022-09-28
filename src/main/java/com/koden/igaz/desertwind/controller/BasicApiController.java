package com.koden.igaz.desertwind.controller;

import com.koden.igaz.desertwind.dto.jelenet.JelenetDTO;
import com.koden.igaz.desertwind.util.JSONConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URISyntaxException;

@CrossOrigin//(origins = "http://localhost:4200")
@RestController
@Slf4j
public class BasicApiController {


    @GetMapping(value = "/inventory")//, produces = "text/plain")
    @ResponseBody
    public String inventory(HttpServletRequest request) {
        return "Ez itt az inventory";
    }

    @GetMapping(value = "/jelenet/{id}", produces = "text/plain")
    @ResponseBody
    public String jelenet(@PathVariable("id") Integer jelenetId, HttpServletRequest request) throws IOException, URISyntaxException {
        // Add Dictionary for szoveg(id,text,etc)
        JelenetDTO jelent = JSONConverter.convertToDTOById(jelenetId);
        return JSONConverter.convertToJSONString(jelent);
    }

}
