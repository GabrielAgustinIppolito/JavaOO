package bankProject.model.softwareHouse;

import java.time.LocalDate;

public class SoftwareHouseStart {
   public static void main(String[] args) {
      System.out.printf("%s ciao%n", "pippo");
      String s = String.format("%s ciao %s","pippo","pluto");
      System.out.println(s);
      Developer d1 = new Developer("Mauro", "Rossi", LocalDate.of(1970,6,20),'m',
                                    "Java");
      Developer d2 = new Developer("Laura", "Lauricelli", LocalDate.of(1994,12,05), 'f',
                  "Python");
      Developer d3 = new Developer("Anna", "Bolena", LocalDate.of(1912,1,23), 'f',
                     "Assembly");
      Developer d4 = new Developer("Giorgio", "Giorgetti", LocalDate.of(2052,1,23), 'f',
            "Quantico");
      ScrumMaster sm1 = new ScrumMaster("Luca", "Lucarelli", LocalDate.of(1970,01,27), 'm',
                        6,2,4);
      boolean added = sm1.addTeamMember(d1);
      checkAdded(added);

      checkAdded(sm1.addTeamMember(d2));

      added = sm1.addTeamMember(d3);
      checkAdded(added);

      checkAdded(sm1.addTeamMember(d4));

      sm1.examineTeam();
      sm1.hasMoreMales();

      System.out.println("Developers a cui piace di più usare Java: " + sm1.countJavaDevs());
      System.out.println("Developers a cui piace di più usare Python: " + sm1.countDevsForLanguage("python"));
   }
   public static void checkAdded(boolean added){
      if (added){
         System.out.println("Ho aggiunto lo sviluppatore");
      } else {
         System.out.println("Il team era già al completo");
      }
   }
}
