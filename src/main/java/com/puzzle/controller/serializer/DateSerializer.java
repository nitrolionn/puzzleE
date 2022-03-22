package com.puzzle.controller.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSerializer extends JsonSerializer<Date> {
    /**
     * Serializes date to string.
     */
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
        throws IOException
    {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(date);

        jsonGenerator.writeString(s);
    }
}