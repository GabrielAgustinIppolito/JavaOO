package bankProject.model;
import java.time.LocalDate;

public class CaymanAccount extends Account {
    private String secretCode;
    public CaymanAccount(double balance, LocalDate openDate, Client client, String secretCode) {
        super(balance, openDate, client);
        this.secretCode = secretCode;
    }
}
