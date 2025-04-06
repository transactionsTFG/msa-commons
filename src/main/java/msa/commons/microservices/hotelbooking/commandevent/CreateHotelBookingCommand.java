package msa.commons.microservices.hotelbooking.commandevent;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateHotelBookingCommand {
    private long userId;
    private String startDate;
    private String endDate;
    private int numberOfNights;
    private boolean withBreakfast;
    private int peopleNumber;
    private String customerDNI;
    private List<String> roomIds;
}