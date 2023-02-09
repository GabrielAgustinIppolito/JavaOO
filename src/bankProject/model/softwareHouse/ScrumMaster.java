package bankProject.model.softwareHouse;

import java.time.LocalDate;

public class ScrumMaster extends Person{
   private int yearsOfExperience;
   private double levelOfPatience;

   private Developer[] team;

   public ScrumMaster(String fn, String ln, LocalDate dob, char sex, int yoe, double lop, int teamSize){
      super(fn, ln, dob, sex);
      this.yearsOfExperience = yoe;
      this.levelOfPatience = lop;
      this.team = new Developer[teamSize];
   }

   @Override
   public void work(){
      System.out.println("Sostanzialmente faccio lavorare gli altri.");
      if(levelOfPatience <= 0){
         System.out.println("VI PRENDO A BASTONATE!!!");
      }
   }
   public void answerQuestion(String question){
//      if(question.length() % 2 == 0){
//         System.out.println("");
//      }
      if((question.length() & 1) == 0){
         System.out.println("Bravo, bella domanda!");
         levelOfPatience++;
      } else {
         System.out.println("Ma come ti viene in mente una cosa del genre?!?!?!");
         levelOfPatience-=2;
      }
   }
   public boolean addTeamMember(Developer d){
      for(int i = 0; i < team.length; i++){
         if (team[i]==null){
            team[i]=d;
            return true;
         }
      }
      return false;
   }
}
