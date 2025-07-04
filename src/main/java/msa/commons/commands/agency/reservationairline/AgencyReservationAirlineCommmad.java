package msa.commons.commands.agency.reservationairline;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import msa.commons.commands.createreservation.CreateReservationCommand;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgencyReservationAirlineCommmad {
    private long idReservationTravel;
    private CreateReservationCommand createReservationCommand;
}
