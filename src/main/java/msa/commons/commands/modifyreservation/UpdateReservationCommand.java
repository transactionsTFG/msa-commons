package msa.commons.commands.modifyreservation;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import msa.commons.commands.modifyreservation.model.IdUpdateFlightInstanceInfo;

@Data
@NoArgsConstructor
public class UpdateReservationCommand {
    private long idReservation;
    private long idTravel;
    private List<IdUpdateFlightInstanceInfo> flightInstanceInfo;
    private boolean allFlightUpdate;
}
