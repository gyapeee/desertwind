package com.koden.igaz.desertwind.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.io.CharStreams;
import com.koden.igaz.desertwind.dto.jelenet.JelenetDTO;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class JelenetConverter extends JSONConverter {

  public static final JelenetDTO JELENET_DTO = new JelenetDTO();

  private JelenetConverter() {
  }

  public static JelenetDTO convertToDTOById(int jelenetId) throws IOException {
    InputStream inputStream = JelenetConverter.class.getClassLoader()
                                                    .getResourceAsStream("jelenet/Jelenet_" + jelenetId + ".json");
    String jsonString = null;
    try (Reader reader = new InputStreamReader(inputStream)) {
      jsonString = CharStreams.toString(reader);
    }

    return JSONConverter.fromJsonString(jsonString, JELENET_DTO);
  }

  public static String convertToJSONString(JelenetDTO jelenet) throws JsonProcessingException {
    return JSONConverter.toJsonString(jelenet);
  }
}
