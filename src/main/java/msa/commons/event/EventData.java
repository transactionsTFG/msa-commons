package msa.commons.event;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import lombok.AllArgsConstructor;
import lombok.Data;
import msa.commons.utils.GsonUtils;

@Data
@AllArgsConstructor
public class EventData {
    private String sagaId;
    private Object data;

    public static <T> EventData fromJson(String json, Class<T> cast) {
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        String sagaId = jsonObject.get("sagaId").getAsString();
        T data = GsonUtils.getInstance().fromJson(jsonObject.get("data"), cast);   
        return new EventData(sagaId, data);
    }
}