import java.util.*;
import java.io.*;
public interface Dice{
  public int RollDice();
}

class NormalDice implements Dice{
  Random rand=new Random();
  public int RollDice(){
    return rand.nextInt(6)+1;
  }
}
