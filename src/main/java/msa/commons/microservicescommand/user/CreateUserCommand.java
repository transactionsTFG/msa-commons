package msa.commons.microservicescommand.user;

import lombok.Data;

@Data
public class CreateUserCommand {
    private long idUser;
    private String typeUser;
}