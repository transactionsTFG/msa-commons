package msa.commons.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Event {
    private EventId eventId;
    private EventResponse payload;
}
