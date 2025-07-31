package msa.commons.commands.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateUserCommand {
    private long idUser;
    private long typeUser;
}