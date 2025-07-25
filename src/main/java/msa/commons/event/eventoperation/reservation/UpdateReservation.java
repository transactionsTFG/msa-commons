package msa.commons.event.eventoperation.reservation;

import msa.commons.event.eventoperation.EventOperation;

public enum UpdateReservation implements EventOperation {
    UPDATE_RESERVATION_ONLY_AIRLINE_BEGIN,
    UPDATE_RESERVATION_ONLY_AIRLINE_COMMIT,
    UPDATE_RESERVATION_ONLY_AIRLINE_ROLLBACK,

    UPDATE_RESERVATION_ONLY_HOTEL_BEGIN,
    UPDATE_RESERVATION_ONLY_HOTEL_COMMIT,
    UPDATE_RESERVATION_ONLY_HOTEL_ROLLBACK;

    @Override
    public String getOperation() {
        return this.name();
    }
}
