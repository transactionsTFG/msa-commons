package msa.commons.commands.hotelbooking;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class DeleteHotelBookingLineCommand {
    long bookingId;
    long roomId;
}
