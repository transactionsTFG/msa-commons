package msa.commons.commands.removereservation;

import lombok.Data;

@Data
public class RemoveBookingCommand {
    private long idBooking;
    private long idTravel;
}
