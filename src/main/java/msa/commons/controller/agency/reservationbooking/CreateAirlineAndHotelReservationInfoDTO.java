package msa.commons.controller.agency.reservationbooking;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import msa.commons.controller.airline.reservation.create.FlightInstanceSeatsDTO;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateAirlineAndHotelReservationInfoDTO {
    private long idCountry;
    private String startDate;
    private String endDate;
    private int numberOfNights;
    private int peopleNumber;
    private long bookingId;
    private Boolean withBreakfast;
    private List<FlightInstanceSeatsDTO> flightInstances;
    private List<Long> roomIds;
}
