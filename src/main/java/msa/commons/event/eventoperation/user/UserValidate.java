package msa.commons.event.eventoperation.user;

import msa.commons.event.eventoperation.EventOperation;

public enum UserValidate implements EventOperation {
    CREATE_RESERVATION_AIRLINE;
    
    @Override
    public String getOperation() {
        return this.name();
    }
}
