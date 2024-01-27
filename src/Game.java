import java.util.ArrayList;

class Game {
  String name;
  int id;
  boolean completed;
  ArrayList<ArrayList<Spot>> board;
  ArrayList<Boolean> lawnmowers;//true = lawnmowers, false = empty
  static ArrayList<Game> levels = new ArrayList<Game>();

  public Game(int cols, int rows, String name) {
    this.board = new ArrayList<ArrayList<Spot>>();
    this.lawnmowers = new ArrayList<Boolean>();
    for (int i = 0; i < rows; i++){
      this.lawnmowers.add(true);
      this.board.add(new ArrayList<Spot>());
      for (int j = 0; j < cols; j++){
        this.board.get(i).add(new Spot());
      }
    }
    this.id = Game.getLevels().size()+1;
    this.name = name;
    this.completed = false;
  }

  public ArrayList<ArrayList<Spot>> getBoard(){
    return this.board;
  }
  public ArrayList<Boolean> getLawnmowers(){
    return getLawnmowers;
  }
  public int getID(){
    return this.ID;
  }
  public String getName(){
    return this.name;
  }
  public String getCompleted(){
    return this.completed;
  }
  public static ArrayList<Game> getLevels() {
    return levels;
  }
}