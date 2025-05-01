package msa.commons.commands.removereservation;

import java.util.List;

import lombok.Data;

@Data
public class RemoveReservationCommand {
    private Long idReservation;
    private boolean isAllRemove;
    private List<IdWithSeats> listIdFlightInstance;
}
