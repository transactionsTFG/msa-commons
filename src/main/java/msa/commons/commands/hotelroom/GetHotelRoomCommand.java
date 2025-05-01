package msa.commons.commands.hotelroom;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetHotelRoomCommand {
    private String roomId;
}
