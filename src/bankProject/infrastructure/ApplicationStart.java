package bankProject.infrastructure;

import bankProject.model.Account;
import bankProject.model.CaymanAccount;
import bankProject.model.special.SpecialAccount;

import java.time.LocalDate;

public class ApplicationStart {
    public static void main(String[] args) {
        System.out.println("Starting Application");

        Account a1 = new Account(1000.0, LocalDate.now(), "Ciccio");
        CaymanAccount ca1 = new CaymanAccount(10_000.0, LocalDate.now(), "Anon", "Eskere");
        SpecialAccount sa1 = new SpecialAccount(100_000.0, LocalDate.now(), "Richie Rich");
        //SpecialAccount sa2 = new String("SpecialAccount");
        //sa2.setBalance(1000);
        //SpecialAccount sa2 = new Account(1000.0, LocalDate.now(), "Ciccio");
        //sa2.setBalance(1000);
        //sa2.evadeTax();
        Account a2 = new SpecialAccount(100_000.0, LocalDate.now(), "Richie Rich");
        Account[] acs = new Account[10];
    }
    public static void handleAccounts(Account[] acs){
        for (int i = 0; i < acs.length; i++) {
            if (acs[i].getBalance() > 1000.0) {
                acs[i].withdraw(10);
            }
        }
    }
    public static void handleAccount(Account x){
        String clientName = x.getClient();
        if (clientName != null && clientName.length() > 10 && clientName.startsWith("sa")){
            x.deposit(10.0);
        }
    }
}
