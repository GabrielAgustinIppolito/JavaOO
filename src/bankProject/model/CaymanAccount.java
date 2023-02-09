package bankProject.model;
import java.time.LocalDate;

public class CaymanAccount extends Account {
    private String secretCode;
    public CaymanAccount(double balance, LocalDate openDate, Client client, String secretCode) {
        super(balance, openDate, client);
        this.secretCode = secretCode;
    }
    public void evadeTax(){
        balance+=1000;
    }
    //@Override //Annotazione --vengono lette dal compilatore (MetaInfo)
    public double deposit(double amount){       //nome, ritorno e parametri
        balance= amount * 1.1;
        return balance;                     //il ritorno nell'overryde deve essere uguale al metodo originale
    }
}
