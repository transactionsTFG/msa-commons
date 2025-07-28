package msa.commons.controller.agency.reservationbooking;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import msa.commons.commands.createreservation.model.CustomerInfo;
import msa.commons.controller.airline.reservation.create.CustomerDTO;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateAirlineAndHotelReservationDTO {
    private long idUser; 
    private CustomerDTO customer;
    private CreateAirlineAndHotelReservationInfoDTO infoReservation;
}
