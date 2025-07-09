package msa.commons.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import msa.commons.event.eventoperation.EventOperation;

@Data
@AllArgsConstructor
public class Event {
    private EventId eventId;
    private EventData value;
    private EventOperation operation;

    public Event(EventId eventId, EventData value) {
        this.eventId = eventId;
        this.value = value;
    }
}
