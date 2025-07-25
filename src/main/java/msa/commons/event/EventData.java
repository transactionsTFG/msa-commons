package msa.commons.event;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import lombok.AllArgsConstructor;
import lombok.Data;
import msa.commons.event.eventoperation.EventOperation;
import msa.commons.utils.GsonUtils;

@Data
@AllArgsConstructor
public class EventData {
    private String sagaId;
    private EventOperation operation;
    private List<EventId> rollbackEventTo;
    private Object data;
    private int transactionActive;

    public EventData(String sagaId, List<EventId> rollbackEventTo, Object data) {
        this.sagaId = sagaId;
        this.rollbackEventTo = rollbackEventTo;
        this.data = data;
    }

    public static <T> EventData fromJson(String json, Class<T> cast) {
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        final Gson gsonUtil = GsonUtils.getInstance();
        String sagaId = jsonObject.get("sagaId").getAsString();
        int transactionActive = jsonObject.has("transactionActive") ? jsonObject.get("transactionActive").getAsInt() : 1;
        List<EventId> rollbackEventTo = gsonUtil.fromJson(jsonObject.get("rollbackEventTo"), new TypeToken<List<EventId>>() {}.getType());
        T data = gsonUtil.fromJson(jsonObject.get("data"), cast);  
        if(jsonObject.get("operation") != null) {
            EventOperation operation = gsonUtil.fromJson(jsonObject.get("operation"), EventOperation.class);
            return new EventData(sagaId, operation, rollbackEventTo, data, transactionActive);
        }
        return new EventData(sagaId, rollbackEventTo, data);
    }
}