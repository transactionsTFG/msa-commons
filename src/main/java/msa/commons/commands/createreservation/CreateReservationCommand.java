package msa.commons.commands.createreservation;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import msa.commons.commands.createreservation.model.CustomerInfo;
import msa.commons.commands.createreservation.model.IdFlightInstanceInfo;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateReservationCommand {
    private CustomerInfo customerInfo;
    private long idReservation;
    private List<IdFlightInstanceInfo> flightInstanceInfo;
    private boolean allFlightBuy;
    private long idReservationTravel;
}
