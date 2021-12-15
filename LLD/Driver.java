import java.util.*;
import java.io.*;
public class Driver{
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Snakes> snakes = new HashMap<Integer,Snakes>();
    HashMap<Integer,Ladders> ladders = new HashMap<Integer,Ladders>();
    Queue<Player> PlayersTurn=new LinkedList<Player>();

    System.out.println("Enter number of snakes");
    int nSnakes=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Head and Tail of the snakes:");
    for(int i=0;i<nSnakes;i++){

      int head=sc.nextInt();
      int tail=sc.nextInt();
      Snakes s=new Snakes(head,tail);
      snakes.put(head,s);
    }
    System.out.println("Enter number of ladders");
    int nLadders=sc.nextInt();

    sc.nextLine();
    System.out.println("Enter StartPoint and EndPoint of the ladders:");
    for (int j=0;j<nLadders;j++){
      int start=sc.nextInt();
      int end=sc.nextInt();
      Ladders l=new Ladders(start,end);
      ladders.put(start,l);

    }
    Board b=new Board(snakes,ladders);


    System.out.println("Enter number of players");
    int nPlayers=sc.nextInt();
      sc.nextLine();
    for(int i=0;i<nPlayers;i++){
      System.out.println("Enter player's name:");
      String playerName=sc.nextLine();
      Player a=new Player(playerName);
      PlayersTurn.add(a);
    }
    Game g=new Game(PlayersTurn);
    g.PlayGame(b);


  }
}
