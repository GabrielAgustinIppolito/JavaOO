package bankProject.infrastructure;

import bankProject.model.Account;
import bankProject.model.CaymanAccount;
import bankProject.model.special.SpecialAccount;

import java.time.LocalDate;

public class ApplicationStart {
    public static void main(String[] args) {
        System.out.println("Starting Application");

        //Account a1 = new Account(1000.0, LocalDate.now(), "Ciccio");
        CaymanAccount ca1 = new CaymanAccount(10_000.0, LocalDate.now(), "Anon", "Eskere");
        SpecialAccount sa1 = new SpecialAccount(100_000.0, LocalDate.now(), "Richie Rich");
        //SpecialAccount sa2 = new String("SpecialAccount");
        //sa2.setBalance(1000);
        //SpecialAccount sa2 = new Account(1000.0, LocalDate.now(), "Ciccio");
        //sa2.setBalance(1000);
        //sa2.evadeTax();
        Account a2 = new SpecialAccount(100_000.0, LocalDate.now(), "Richie Rich");
        Account[] acs = new Account[10];

        Account x =(Account) new CaymanAccount();

        //x.evadi il puntatore guarda la reference nohn l'oggetto che punta
        /*if(Math.random() > 0.5){
            x = new Account();
        }*/
        if (x instanceof CaymanAccount){          // facciamo il casting controllando che sìa veramente un CaymanAccount
            CaymanAccount y = (CaymanAccount) x; //casting da account a caymanAccount *DOWNCASTING*
            y.evadeTax();
        }
        CaymanAccount x1 = new CaymanAccount();
        x1.deposit(1000); //CaymanAccount deposit method
        //Account x2 = new Account();
        //x2.deposit(1000); //Account deopsit method
        Account x3 = new CaymanAccount();
        x3.deposit(1000); // Cayman deposit method


    }
    public static void handleAccounts(Account[] acs){
        for (int i = 0; i < acs.length; i++) {
            if (acs[i].getBalance() > 1000.0) {
                acs[i].withdraw(10);
            }
        }
    }
    public static void handleAccount(Account x){
        String clientName = x.getClient().getFullName();
        if (clientName != null && clientName.length() > 10 && clientName.startsWith("sa")){
            x.deposit(10.0);
        }
    }
}
