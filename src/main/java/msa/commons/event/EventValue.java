package msa.commons.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class EventValue {
    private boolean success;
    private String message;
    private Object data;

    public static EventValue success(Object data) {
        return EventValue.builder()
                .success(true)
                .message("Success")
                .data(data)
                .build();
    }

    public static EventValue error(String message) {
        return EventValue.builder()
                .success(false)
                .message(message)
                .data(null)
                .build();
    }
}
