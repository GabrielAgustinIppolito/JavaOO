package bankProject.model.softwareHouse;

public class Office {
   private Person[] employee;

   public Office(Person[] employee){
      this.employee = employee;
   }

   public void startDayOfWork(){
      for(int i = 0; i < employee.length; i++){
         if(employee[i] != null) {
            employee[i].work();
         }
      }
      for(Person p : employee) { // per ogni persona p nell'array employee
         p.speak();
      }
   }
}
