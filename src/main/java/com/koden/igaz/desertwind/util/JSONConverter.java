package com.koden.igaz.desertwind.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class JSONConverter {
  // Date-time helpers
  // @formatter:off
  private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder().appendOptional(
                                                                                                     DateTimeFormatter.ISO_DATE_TIME)
                                                                                             .appendOptional(
                                                                                                     DateTimeFormatter.ISO_OFFSET_DATE_TIME)
                                                                                             .appendOptional(
                                                                                                     DateTimeFormatter.ISO_INSTANT)
                                                                                             .appendOptional(
                                                                                                     DateTimeFormatter.ofPattern(
                                                                                                             "yyyy-MM-dd HH:mm:ss.SX"))
                                                                                             .appendOptional(
                                                                                                     DateTimeFormatter.ofPattern(
                                                                                                             "yyyy-MM-dd HH:mm:ssX"))
                                                                                             .appendOptional(
                                                                                                     DateTimeFormatter.ofPattern(
                                                                                                             "yyyy-MM-dd HH:mm:ss"))
                                                                                             .toFormatter()
                                                                                             .withZone(ZoneOffset.UTC);
  // @formatter:on

  // @formatter:off
  private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder().appendOptional(
                                                                                                DateTimeFormatter.ISO_TIME)
                                                                                        .appendOptional(
                                                                                                DateTimeFormatter.ISO_OFFSET_TIME)
                                                                                        .parseDefaulting(
                                                                                                ChronoField.YEAR, 2020)
                                                                                        .parseDefaulting(
                                                                                                ChronoField.MONTH_OF_YEAR,
                                                                                                1)
                                                                                        .parseDefaulting(
                                                                                                ChronoField.DAY_OF_MONTH,
                                                                                                1)
                                                                                        .toFormatter()
                                                                                        .withZone(ZoneOffset.UTC);
  // @formatter:on
  private static ObjectReader reader;
  private static ObjectWriter writer;
  // Serialize/deserialize helpers

  public static OffsetDateTime parseDateTimeString(String str) {
    return ZonedDateTime.from(JSONConverter.DATE_TIME_FORMATTER.parse(str))
                        .toOffsetDateTime();
  }

  public static OffsetTime parseTimeString(String str) {
    return ZonedDateTime.from(JSONConverter.TIME_FORMATTER.parse(str))
                        .toOffsetDateTime()
                        .toOffsetTime();
  }

  public static <T> T fromJsonString(String json, T obj) throws IOException {
    return getObjectReader(obj).readValue(json);
  }

  public static <T> String toJsonString(T obj) throws JsonProcessingException {
    return getObjectWriter(obj).writeValueAsString(obj);
  }

  private static <T> void instantiateMapper(T obj) {
    ObjectMapper mapper = new ObjectMapper();
    mapper.findAndRegisterModules();
    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    SimpleModule module = new SimpleModule();
    module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
      @Override
      public OffsetDateTime deserialize(JsonParser jsonParser,
                                        DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();
        return JSONConverter.parseDateTimeString(value);
      }
    });
    mapper.registerModule(module);
    reader = mapper.readerFor(obj.getClass());
    writer = mapper.writerFor(obj.getClass());
  }

  private static <T> ObjectReader getObjectReader(T type) {
    if (reader == null) {
      instantiateMapper(type);
    }
    return reader;
  }

  private static <T> ObjectWriter getObjectWriter(T type) {
    if (writer == null) {
      instantiateMapper(type);
    }
    return writer;
  }
}