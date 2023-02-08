package bankProject.model.special;
import bankProject.model.Account;
import bankProject.model.Client;

import java.time.LocalDate;

public class SpecialAccount extends Account {
    private final String special = getClient().getFullName() + ", you're special!";
    public SpecialAccount(double balance, LocalDate openDate, Client client){
        super(balance, openDate, client);
    }
}
