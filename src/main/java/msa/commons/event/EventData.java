package msa.commons.event;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import lombok.AllArgsConstructor;
import lombok.Data;
import msa.commons.utils.GsonUtils;

@Data
@AllArgsConstructor
public class EventData {
    private String sagaId;
    private List<EventId> rollbackEventTo;
    private Object data;

    public static <T> EventData fromJson(String json, Class<T> cast) {
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        final Gson gsonUtil = GsonUtils.getInstance();
        String sagaId = jsonObject.get("sagaId").getAsString();
        List<EventId> rollbackEventTo = gsonUtil.fromJson(jsonObject.get("rollbackEventTo"), new TypeToken<List<EventId>>() {}.getType());
        T data = gsonUtil.fromJson(jsonObject.get("data"), cast);   
        return new EventData(sagaId, rollbackEventTo, data);
    }
}