package com.koden.igaz.desertwind.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.koden.igaz.desertwind.dto.jelenet.JelenetDTO;

import java.io.IOException;
import java.io.InputStream;

public class JSONConverter {
    public static JelenetDTO convertToDTOById(int jelenetId) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = JSONConverter.class.getClassLoader().getResourceAsStream("jelenet/Jelenet_" + jelenetId + ".json");
        return objectMapper.readValue(inputStream, JelenetDTO.class);
    }

    public static String convertToJSONString(JelenetDTO jelenet) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writer().withDefaultPrettyPrinter().writeValueAsString(jelenet);
    }

    private JSONConverter() {
    }
}
