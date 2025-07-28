package msa.commons.commands.hotelbooking;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import msa.commons.commands.createreservation.model.CustomerInfo;
import msa.commons.commands.hotelroom.model.RoomInfo;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateHotelBookingCommand {
    private long bookingId;
    private String startDate;
    private String endDate;
    private int numberOfNights;
    private boolean withBreakfast;
    private int peopleNumber;
    private List<RoomInfo> roomsInfo;
    private CustomerInfo customerInfo;
    private long travelUserId;
    private long idTravelAgency;
}