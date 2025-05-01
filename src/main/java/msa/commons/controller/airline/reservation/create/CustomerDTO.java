package msa.commons.controller.airline.reservation.create;

import lombok.Data;

@Data
public class CustomerDTO {
    private String name;
    private String email;
    private String phone;
    private String dni;
}
