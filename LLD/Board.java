import java.util.*;
import java.io.*;
class Board{
  HashMap<Integer,Snakes> SnakesMap=new HashMap<Integer,Snakes>();
  HashMap<Integer,Ladders> LaddersMap=new HashMap<Integer,Ladders>();
  private int winPoint=100;

  public Board(HashMap<Integer,Snakes> SnakesMap,HashMap<Integer,Ladders> LaddersMap){
    this.SnakesMap=SnakesMap;
    this.LaddersMap=LaddersMap;
  }
  public int getwinPoint(){
    return winPoint;
  }
  public HashMap<Integer,Ladders> getLadders(){
    return LaddersMap;
  }
  public HashMap<Integer,Snakes> getSnakes(){
    return SnakesMap;
  }

}
