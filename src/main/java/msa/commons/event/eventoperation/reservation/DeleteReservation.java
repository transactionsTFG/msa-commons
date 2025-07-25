package msa.commons.event.eventoperation.reservation;

import msa.commons.event.eventoperation.EventOperation;

public enum DeleteReservation implements EventOperation {
    DELETE_RESERVATION_ONLY_AIRLINE_BEGIN,
    DELETE_RESERVATION_ONLY_AIRLINE_COMMIT,
    DELETE_RESERVATION_ONLY_AIRLINE_ROLLBACK,

    DELETE_RESERVATION_ONLY_HOTEL_BEGIN,
    DELETE_RESERVATION_ONLY_HOTEL_COMMIT,
    DELETE_RESERVATION_ONLY_HOTEL_ROLLBACK;

    @Override
    public String getOperation() {
        return this.name();
    }
}
