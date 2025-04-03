package msa.commons.microservices.user.commandevent;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateUserCommand {
    private long idUser;
    private String typeUser;
}