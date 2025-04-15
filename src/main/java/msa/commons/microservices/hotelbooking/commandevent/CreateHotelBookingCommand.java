package msa.commons.microservices.hotelbooking.commandevent;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import msa.commons.microservices.hotelroom.commandevent.model.RoomInfo;
import msa.commons.microservices.reservationairline.commandevent.model.CustomerInfo;

@Data
@AllArgsConstructor
@Builder
public class CreateHotelBookingCommand {
    private long bookingId;
    private long userId;
    private String startDate;
    private String endDate;
    private int numberOfNights;
    private boolean withBreakfast;
    private int peopleNumber;
    private String customerDNI;
    private List<RoomInfo> roomsInfo;
    private CustomerInfo customerInfo;
}