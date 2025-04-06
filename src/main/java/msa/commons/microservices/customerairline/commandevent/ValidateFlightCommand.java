package msa.commons.microservices.customerairline.commandevent;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import msa.commons.microservices.reservationairline.commandevent.model.IdFlightInstanceInfo;

@Data
@AllArgsConstructor
@Builder
public class ValidateFlightCommand {
    private boolean previouslyCreated;
    private long idCustomner;
    private List<IdFlightInstanceInfo> flightInstanceInfo;
}
