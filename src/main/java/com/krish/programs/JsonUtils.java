package com.krish.helper.utilities;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {

	
	public static boolean isJSONValid(String jsonInString) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(jsonInString);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
    public static boolean isJSONValid(File file) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(file);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static String serializeAsJsonString(Object object) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper objMapper = new ObjectMapper();
        objMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        StringWriter sw = new StringWriter();
        objMapper.writeValue(sw, object);
        return sw.toString();
    }

    public static String serializeAsJsonString(Object object, boolean indent) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper objMapper = new ObjectMapper();
        if (indent == true) {
            objMapper.enable(SerializationFeature.INDENT_OUTPUT);
            objMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        }

        StringWriter stringWriter = new StringWriter();
        objMapper.writeValue(stringWriter, object);
        return stringWriter.toString();
    }

    public static <T> T jsonStringToObject(String content, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        T obj = null;
        ObjectMapper objMapper = new ObjectMapper()
        		.registerModule(new JavaTimeModule())
        		.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        		.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
        		.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        obj = objMapper.readValue(content, clazz);
        return obj;
    }

    @SuppressWarnings("rawtypes")
    public static <T> T jsonStringToObjectArray(String content) throws JsonParseException, JsonMappingException, IOException {
        T obj = null;
        ObjectMapper mapper = new ObjectMapper();
        obj = mapper.readValue(content, new TypeReference<List>() {
        });
        return obj;
    }

    public static <T> T jsonStringToObjectArray(String content, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        T obj = null;
        ObjectMapper mapper = new ObjectMapper()
        		.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
        		.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        obj = mapper.readValue(content, mapper.getTypeFactory().constructCollectionType(List.class, clazz));
        return obj;
    }
    
    public static <T> T jsonFileToObject(File file, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        T obj = null;
        ObjectMapper objMapper = new ObjectMapper();
        obj = objMapper.readValue(file, clazz);
        return obj;
    }
    
    public static <T> T jsonFileToObjectArray(File file, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        T obj = null;
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        obj = mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(List.class, clazz));
        return obj;
    }
    
    /*To convert string  json object*/
    public static <T> T stringToObject(String jsonString, Class<T> objectClass) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, objectClass);
    }

    /*to convert object to String*/
    public static String objectToString(Object object) {
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).create();
        return gson.toJson(object);
    }
}
