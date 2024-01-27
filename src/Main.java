import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    boolean playing = true, alive;
    String option;
    Scanner sc = new Scanner(System.in);
    Game play;
    
    Game uno = new Game(9, 5);
    
    while(playing){
      //print title screen + level menu
      System.out.println("---------\n   Poz   \n---------");
      System.out.println("\nchoose level:\n");
      for(Game g : Game.getLevels()){
        System.out.printf("  %d: %s%n" + g.getID(), g.getCompleted());
      }
      System.out.println("  0: exit\n");

      //pick level
      option = sc.nextLine();
      if(option.equals("0")){//exit program case
        playing = false;
        continue;
      }
      while(option!=null){
        try{
          play = Game.getLevels().get(Integer.parseInt(option)-1);
        }
        catch(NumberFormatException e){
          System.out.println("Invalid option");
          option = null;
          continue;
        }
        catch(IndexOutOfBoundsException e){
          System.out.println("Invalid option");
          option = null;
          continue;
        }
        alive = true;
        while(alive){
          //print board
          for(ArrayList a : Game.getLevels()){
            System.out.println();
            for(Spot s : a){
              if(s.getZOccupying().size() == 0){
                System.out.printf("  %n%s", s.getDisplay());
              }
              else{
                System.out.printf("%d%d%n%s", s.getZOccupying().size(), s.getZOccupying.get(0), s.getDisplay());
              }
            }
          }


        }
      }
    }
  }
}