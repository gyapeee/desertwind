package com.koden.igaz.desertwind.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.koden.igaz.desertwind.dto.jelenet.JelenetDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
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

        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("jelenet/Jelenet" + jelenetId + ".json");
        JelenetDTO jelent = objectMapper.readValue(inputStream, JelenetDTO.class);

        return objectMapper.writer().withDefaultPrettyPrinter().writeValueAsString(jelent);
    }

}
