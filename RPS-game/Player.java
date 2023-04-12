import java.util.Scanner;
import java.util.Random;

public class Player
{ 
  Scanner input = new Scanner(System.in);
  public String humanplayer ;
  public String computerplayer ;

  public String performMove() //for overrider method
  {
    return "performMove";
  }

  public void Info()
  {
    System.out.println("---Player are coming---");
  }

  public void Action() 
  {
    System.out.println("Players are ready!!");
    System.out.println();
  }
}