package msa.commons.commands.hotelcustomer.model;

import lombok.Data;

@Data
public class BookingCustomer {
    private String name;
    private String email;
    private String phone;
    private String dni;
    private boolean isPreviouslyCreated;
    private long idCustomer;
}
