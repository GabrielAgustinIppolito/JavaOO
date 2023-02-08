package bankProject.model;
import java.time.LocalDate;

public class Account{
    protected double balance;
    private final LocalDate openDate;
    private String clientName;
    //il metodo non ha bisogno di esprimere esplicitamente
    //le variabili dell'oggetto di cui fa parte
    public Account(double balance, LocalDate openDate, String clientName) {
        this.balance = balance;
        this.openDate = openDate;
        this.clientName = clientName;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double b) {
        this.balance = balance * 100;
    }

    public LocalDate getOpenDate(){
        return openDate;
    }

    public String getClient(){
        return clientName;
    }

    public void setClient(String c){
        clientName = c;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

}