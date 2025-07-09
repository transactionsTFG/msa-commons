package msa.commons.event.eventoperation.reservation;

import msa.commons.event.eventoperation.EventOperation;

public enum ReservationAirline implements EventOperation {
    CREATE_RESERVATION_ONLY_AIRLINE;

    @Override
    public String getOperation() {
        return this.name();
    }
    
}
