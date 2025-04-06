package msa.commons.microservices.hotelroom.commandevent;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetHotelRoomCommand {
    private String roomId;
}
