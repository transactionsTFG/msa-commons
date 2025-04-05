package msa.commons.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class EventResponse {
    private boolean success;
    private String message;
    private Object data;

    public static EventResponse success(Object data) {
        return EventResponse.builder()
                .success(true)
                .message("Success")
                .data(data)
                .build();
    }

    public static EventResponse error(String message) {
        return EventResponse.builder()
                .success(false)
                .message(message)
                .data(null)
                .build();
    }
}
