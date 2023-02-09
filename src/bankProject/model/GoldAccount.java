package bankProject.model;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class GoldAccount extends Account{
   private double bonus;

   public GoldAccount(double balance, LocalDate openDate, Client client, double bonus){
      super (balance, openDate, client);
      this.bonus = bonus;
   }

   //@Override
   public double deposit(double amount){
      //super.deposit(amount); //esegue il deposit della classe madre Account
      balance += amount;
      if(LocalDate.now().getDayOfWeek() == DayOfWeek.SUNDAY ){
         balance += bonus;
      }
      return balance;
   }
}
