package msa.commons.commands.removereservation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdWithSeats {
    private Long idFlightInstance;
    private int seats;   
}
