package msa.commons.commands.modifyreservation.model;

import lombok.Data;

@Data
public class IdUpdateFlightInstanceInfo {
    private long idFlightInstance;
    private int numberSeats;
    private double price;
    private long idAircraft;
    private int totalOccupiedSeats;
    private Action action;
}
