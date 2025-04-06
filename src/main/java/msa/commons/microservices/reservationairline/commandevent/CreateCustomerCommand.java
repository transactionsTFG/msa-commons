package msa.commons.microservices.reservationairline.commandevent;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import msa.commons.microservices.reservationairline.commandevent.model.CustomerInfo;
import msa.commons.microservices.reservationairline.commandevent.model.IdFlightInstanceInfo;

@Data
@AllArgsConstructor
@Builder
public class CreateCustomerCommand {
    private CustomerInfo customerInfo;
    private List<IdFlightInstanceInfo> flightInstanceInfo;
}
