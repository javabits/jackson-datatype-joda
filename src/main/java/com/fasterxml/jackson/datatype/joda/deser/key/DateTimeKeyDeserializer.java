package com.fasterxml.jackson.datatype.joda.deser.key;

import java.io.IOException;

import org.joda.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;

public class DateTimeKeyDeserializer extends JodaKeyDeserializer {

    @Override
    protected DateTime deserialize(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException{
        return new DateTime(key, DateTimeZone.forTimeZone(ctxt.getTimeZone()));
    }

}
