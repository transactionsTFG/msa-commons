package msa.commons.parser;

import java.util.Optional;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import msa.commons.event.eventoperation.EventOperation;
import msa.commons.utils.GsonUtils;

public final class ObjectUtils {
    private ObjectUtils() {}

    public static Optional<String> getNameOperation(Object obj) {
        JsonObject jsonObject = JsonParser.parseString(GsonUtils.getInstance().toJson(obj)).getAsJsonObject();
        return jsonObject.has("operation") 
            ? Optional.of(GsonUtils.getInstance().fromJson(jsonObject.get("operation"), EventOperation.class).getOperation()) 
            : Optional.empty();
    }

    public static String getString(Object obj){
        if (obj == null) 
            return "";
        
        if (obj instanceof String s)
            return s;

        return obj.toString();
    }

    public static <T> boolean isInstanceOf(Object obj, Class<T> type) {
        if (type == null) 
            return false;
        return type.isInstance(obj);
    }

    public static <T> T safeCast(Object obj, Class<T> type) {
        return type.isInstance(obj) ? type.cast(obj) : null;
    }

}
