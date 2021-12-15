import java.util.*;
import java.io.*;
public class Game{
    private Queue<Player> PlayerTurn=new LinkedList<Player>();
    public Game(Queue<Player> PlayerTurn){
        this.PlayerTurn=PlayerTurn;
    }
    public void PlayGame(Board b){
      HashMap<Integer,Snakes> s=b.getSnakes();
      HashMap<Integer,Ladders> l=b.getLadders();
      Dice d=new NormalDice();
      int finalPoint=b.getwinPoint();

      while (PlayerTurn.size()>1){
        Player p=PlayerTurn.poll();
        int Position=p.getLocation();
        int move=d.RollDice();

        while (move%6==0){
          move+=d.RollDice();
          if (move==18){
            move=0;
            break;
          }
        }
        if(Position+move<=finalPoint){
          int nextPos;
          if(s.containsKey(Position+move)){
            Snakes S=s.get(Position+move);
            nextPos=S.getEnd();
          }
          else if(l.containsKey(Position+move)){
            Ladders L=l.get(Position+move);
            nextPos=L.getEnd();
          }
          else{
            nextPos=Position+move;
          }
          p.setPath(nextPos);
          p.setLocation(nextPos);
        }
        if(p.getLocation()==finalPoint){
          System.out.println("YAYY!"+p.getName()+" HAS WON THE GAME!!!");
          p.getPath();
        }
        else{
          PlayerTurn.add(p);
        }
      }


    }

}
