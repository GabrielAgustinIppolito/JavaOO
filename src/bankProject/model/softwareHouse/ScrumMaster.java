package bankProject.model.softwareHouse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class ScrumMaster extends Person{
   private int yearsOfExperience;
   private double levelOfPatience;
   private ArrayList<Developer> team; //puntatore arraylist tipo Developer di nome team
   public final int MAX_TEAM_SIZE; //publica perché essendo una costante che non evolverà e non ci interessa renderla privata
   private String[] pronoums = {"Cosa", "Come", "Perché", "Dove", "Chi", "Quando"};
   private String[] verbs = {"é", "significa","si trova", "indica"};
   private String[] objects={"polimorfismo", "classe astratta", "sviluppo Agile", "costruttore", "programmzaione Object Oriented"};
   private Random generator;
   public ScrumMaster(String fn, String ln, LocalDate dob, char sex, int yoe, double lop, int teamSize){
      super(fn, ln, dob, sex);
      this.yearsOfExperience = yoe;
      this.levelOfPatience = lop;
      this.team = new ArrayList<>(); //non é necessario mettere il tipo (Developer)
      this.MAX_TEAM_SIZE = teamSize;
      this.generator = new Random();
   }

   public ScrumMaster(String fn, String ln, LocalDate dob, char sex, int yoe, double lop, int teamSize, ArrayList<Developer> teamArray){
      super(fn, ln, dob, sex);
      this.yearsOfExperience = yoe;
      this.levelOfPatience = lop;
      this.team =teamArray; //non é necessario mettere il tipo (Developer)
      this.MAX_TEAM_SIZE = teamSize;
      this.generator = new Random();
   }

   @Override
   public void work(){
      System.out.println("Sostanzialmente faccio lavorare gli altri.");
      if(levelOfPatience <= 0){
         System.out.println("VI PRENDO A BASTONATE!!!");
      }
   }
   public void examineTeam(){
      for(Developer d : team){
         String question = makeQuestion();
//         System.out.println(d.getFullName());
//         System.out.println(question);
         String output = String.format("%s chiede: %s", d.getFullName(),question);
         System.out.println(output);
         answerQuestion(question);
         if(levelOfPatience > 0){
            System.out.println("Che bravo il mio studente!");
         } else {
            System.out.println("ma li mortacci vostri!!! \n BASTA! ME NE VADO AI CARAIBI!");
         }

      }
   }
   private String makeQuestion(){
      int p1 = generator.nextInt(pronoums.length);
      int p2 = generator.nextInt(verbs.length);
      int p3 = generator.nextInt(objects.length);
//      String question = pronoums[p1] + " " + verbs[p2] + " " + objects[p3] + "?";
      String question = String.format("%s %s %s?", pronoums[p1], verbs[p2], objects[p3]); //%s buco di tipo stringa da riempire con la stringa messa dopo
      return question;
   }

   public void answerQuestion(String question){
//      if(question.length() % 2 == 0){
//         System.out.println("");
//      }
      if((question.length() & 1) == 0){ // se il length è pari ->
         System.out.println("Andiamo avanti...");
         levelOfPatience++;
      } else {
         System.out.println("Ma come ti viene in mente una cosa del genre?!?!?!");
         levelOfPatience-=2;
      }
   }
   public boolean addTeamMember(Developer d){
      //int s=team.size();      //da ArrayList ci da la quantità di elementi enll'array non la lunghezza dell'array
      if(team.size()<MAX_TEAM_SIZE){
         team.add(d);         //sempre da ArrayList ci aggiunge un elemento nella prima posizione libera
         return true;
      }
      return false;
   }
   //true se maschi false se femmine
   public boolean hasMoreMales(){
      int counterMales = 0, counterFemales = 0;
      for (Developer dev : team){
         if (dev.isMale()){
            counterMales++;
         } else {
            counterFemales++;
         }
      }
      return counterMales > counterFemales;
   }
   //numero degli sviluppatori che sono sviluppatori Java
   public int countJavaDevs(){
      return countDevsForLanguage("Java");
//      for (Developer dev : team){
//         if(dev.getFavouriteLenguage().equalsIgnoreCase("Java")){
//            counterDev++;
//         }
//      }
//      return counterDev;
   }
   //passo il nome di un linguaggio qualsiesi, e me ne contano quanti lo conoscono
   public int countDevsForLanguage(String language){
      int counterDev = 0;
      for (Developer dev : team){
         if(dev.getFavouriteLenguage().equalsIgnoreCase(language)){
            counterDev++;
         }
      }
      return counterDev;
   }

}
