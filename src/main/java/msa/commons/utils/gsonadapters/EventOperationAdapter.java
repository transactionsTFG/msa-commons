package msa.commons.utils.gsonadapters;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import msa.commons.event.eventoperation.EventOperation;
import msa.commons.event.eventoperation.reservation.CreateReservation;
import msa.commons.event.eventoperation.user.UserValidate;

public class EventOperationAdapter implements JsonSerializer<EventOperation>, JsonDeserializer<EventOperation>{

    private static final Map<String, Class<? extends EventOperation>> ENUMS = new HashMap<>();
    static {
        ENUMS.put(UserValidate.class.getSimpleName(),    UserValidate.class);
        ENUMS.put(CreateReservation.class.getSimpleName(), CreateReservation.class);
    }


    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public EventOperation deserialize(JsonElement json, Type arg1, JsonDeserializationContext arg2)
            throws JsonParseException {
        String encoded = json.getAsString();  
        String[] parts  = encoded.split(":");
        if (parts.length != 2)
            return null;
        String enumName   = parts[0];                        // "UserValidate"
        String constant   = parts[1]; 
        Class<? extends EventOperation> enumClass = ENUMS.get(enumName);
        if (enumClass == null)
            return null;
    
        try {
            Enum<? extends EventOperation> e = Enum.valueOf((Class) enumClass, constant);
            return (EventOperation) e;
        } catch (IllegalArgumentException ex) {
            return null;
        }
    }

    @Override
    public JsonElement serialize(EventOperation src, Type arg1, JsonSerializationContext arg2) {
        if (src == null) 
            return null;
        return new JsonPrimitive(src.getQualifiedOperation());
    }
    
}
