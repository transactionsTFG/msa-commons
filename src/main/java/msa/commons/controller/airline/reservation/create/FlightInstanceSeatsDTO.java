package msa.commons.controller.airline.reservation.create;

import lombok.Data;

@Data
public class FlightInstanceSeatsDTO {
    private long idFlightInstance;
    private int numberSeats;
}
