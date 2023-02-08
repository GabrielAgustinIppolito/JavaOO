package bankProject.model.special;
import bankProject.model.Account;

import java.time.LocalDate;

public class SpecialAccount extends Account {
    private final String special = getClient()+", you're special!";
    public SpecialAccount(double balance, LocalDate openDate, String clientName){
        super(balance, openDate, clientName);
    }
}
