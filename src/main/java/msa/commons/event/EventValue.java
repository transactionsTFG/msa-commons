package msa.commons.event;

import lombok.Data;

@Data
public class EventValue {
    private boolean success;
    private String message;
    private Object data;
}
