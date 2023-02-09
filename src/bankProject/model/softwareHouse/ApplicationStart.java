package bankProject.model.softwareHouse;

import java.time.LocalDate;

public class ApplicationStart {
   public static void main(String[] args) {
      Developer d1 = new Developer("Mauro", "Rossi", LocalDate.of(1970,6,20),'m',
                                    "Java");
      Developer d2 = new Developer("Laura", "Lauricelli", LocalDate.of(1994,12,05), 'f',
                  "Python");
      Developer d3 = new Developer("Anna", "Bolena", LocalDate.of(1912,1,23), 'f',
                     "Binario");
      ScrumMaster sm1 = new ScrumMaster("Luca", "Lucarelli", LocalDate.of(1970,01,27), 'm',
                        6,2,2);
      boolean added = sm1.addTeamMember(d1);
      if (added){
         System.out.println("Ho aggiunto lo sviluppatore");
      } else {
         System.out.println("Il team era già al completo");
      }
      added = sm1.addTeamMember(d2);
      if (added){
         System.out.println("Ho aggiunto lo sviluppatore");
      } else {
         System.out.println("Il team era già al completo");
      }
      added = sm1.addTeamMember(d3);
      if (added){
         System.out.println("Ho aggiunto lo sviluppatore");
      } else {
         System.out.println("Il team era già al completo");
      }

   }
}
