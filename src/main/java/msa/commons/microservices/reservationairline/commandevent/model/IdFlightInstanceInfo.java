package msa.commons.microservices.reservationairline.commandevent.model;

import lombok.Data;

@Data
public class IdFlightInstanceInfo {
    private long idFlightInstance;
    private int numberSeats;
    private double price;
    private long idAircraft;
    private int totalOccupiedSeats;
}
