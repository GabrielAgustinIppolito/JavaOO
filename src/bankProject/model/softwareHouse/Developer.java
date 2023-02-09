package bankProject.model.softwareHouse;

import java.time.LocalDate;


public class Developer extends Person{

   private String favouriteLenguage;
   public Developer(String fn, String ln, LocalDate dob, char sex,String fl){
      super(fn, ln, dob, sex);
      this.favouriteLenguage = fl;
   }
   @Override
   public void work() {
      System.out.println("Penso, penso, penso...");
      System.out.println("Non ci ho capito ancora niente...");
      System.out.println("Melgio che mi prenda un caffé!");
      System.out.println("Ah! Adesso ho capito!!!");
   }
   public String getFavouriteLenguage(){
      return favouriteLenguage;
   }
}
