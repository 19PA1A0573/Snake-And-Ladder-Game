import java.util.*;
import java.io.*;
public class Player{

    private String name;
    private ArrayList<Integer> PlayerPath=new ArrayList<Integer>() ;
    private int location=0;
    public Player(String name){
        this.name=name;

    }

    public String getName(){
        return name;
    }
    public void getPath(){
      for (int i: PlayerPath){
        System.out.println(name+" reached "+i);
      }
    }
    public int getLocation(){
      return location;
    }

    public void setLocation(int location){
      this.location=location;
    }
    public void setPath(int n){
      PlayerPath.add(n);
    }

}
