package msa.commons.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventData {
    private String sagaId;
    private Object data;
}