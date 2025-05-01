package msa.commons.microservices.reservationairline.commandevent;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import msa.commons.microservices.reservationairline.commandevent.model.CustomerInfo;
import msa.commons.microservices.reservationairline.commandevent.model.IdFlightInstanceInfo;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateReservationCommand {
    private CustomerInfo customerInfo;
    private long idReservation;
    private List<IdFlightInstanceInfo> flightInstanceInfo;
    private boolean allFlightBuy;
}
