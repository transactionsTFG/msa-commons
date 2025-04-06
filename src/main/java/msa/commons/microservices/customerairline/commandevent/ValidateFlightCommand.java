package msa.commons.microservices.customerairline.commandevent;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import msa.commons.microservices.reservationairline.commandevent.model.IdFlightInstanceInfo;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ValidateFlightCommand {
    private boolean previouslyCreated;
    private long idCustomner;
    private long idReservation;
    private List<IdFlightInstanceInfo> flightInstanceInfo;
}
