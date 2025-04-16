package msa.commons.microservices.reservationairline.updatereservation.command;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import msa.commons.microservices.reservationairline.updatereservation.model.IdUpdateFlightInstanceInfo;

@Data
@NoArgsConstructor
public class UpdateReservationCommand {
    private long idReservation;
    private List<IdUpdateFlightInstanceInfo> flightInstanceInfo;
}
