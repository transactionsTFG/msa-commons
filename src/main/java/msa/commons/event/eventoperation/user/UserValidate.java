package msa.commons.event.eventoperation.user;

import msa.commons.event.eventoperation.EventOperation;

public enum UserValidate implements EventOperation {
    CREATE_RESERVATION_AIRLINE,
    CREATE_RESERVATION_HOTEL;
    
    @Override
    public String getOperation() {
        return this.name();
    }
}
