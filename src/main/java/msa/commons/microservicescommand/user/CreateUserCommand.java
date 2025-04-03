package msa.commons.microservicescommand.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateUserCommand {
    private long idUser;
    private String typeUser;
}