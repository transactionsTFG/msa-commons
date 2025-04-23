package msa.commons.utils.gsonadapters;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class LocalDateTimeAdapter implements  JsonSerializer<LocalDateTime>, JsonDeserializer<LocalDateTime>  {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public JsonElement serialize(LocalDateTime date, Type arg1, JsonSerializationContext arg2) {
        return new JsonPrimitive(date.format(FORMATTER));
    }

    @Override
    public LocalDateTime deserialize(JsonElement json, Type arg1, JsonDeserializationContext arg2)
            throws JsonParseException {
        return LocalDateTime.parse(json.getAsString(), FORMATTER);
    }

   
    
}
