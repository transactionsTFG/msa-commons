package msa.commons.controller.hotel.booking;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import msa.commons.controller.airline.reservation.create.CustomerDTO;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateHotelBookingDTO {
    private long bookingId;
    private String sagaId;
    private CustomerDTO customer;
    private String startDate;
    private String endDate;
    private int numberOfNights;
    private Boolean withBreakfast;
    private int peopleNumber;
    private double totalPrice;
    private String customerDNI;
    private String userId;
    private List<msa.commons.commands.hotelroom.model.RoomInfo> roomsInfo;
}
