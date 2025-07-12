package msa.commons.controller.agency.reservationairline;

import java.util.List;

import lombok.Data;
import msa.commons.controller.airline.reservation.create.FlightInstanceSeatsDTO;

@Data
public class ReservationAirlineRequestDTO {
    private String dni;
    private long idUser;
    private List<FlightInstanceSeatsDTO> listIdFlightInstanceSeats;
}
