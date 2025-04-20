package msa.commons.microservices.reservationairline.removereservation.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdWithSeats {
    private Long idFlightInstance;
    private int seats;   
}
