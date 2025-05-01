package msa.commons.commands.createreservation.model;

import lombok.Data;

@Data
public class CustomerInfo {
    private String name;
    private String email;
    private String phone;
    private String dni;
    private boolean isPreviouslyCreated;
    private long idCustomer;
}
