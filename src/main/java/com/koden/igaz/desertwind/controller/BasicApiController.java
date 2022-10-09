package com.koden.igaz.desertwind.controller;

import com.koden.igaz.desertwind.dto.jelenet.JelenetDTO;
import com.koden.igaz.desertwind.util.JSONConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

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
  public String jelenet(@PathVariable("id") Integer jelenetId, HttpServletRequest request) throws IOException {
    // Add Dictionary for szoveg(id,text,etc)
    JelenetDTO jelenet = JSONConverter.convertToDTOById(jelenetId);
    return JSONConverter.convertToJSONString(jelenet);
  }

}
