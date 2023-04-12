import java.util.Scanner;
import java.util.Random;

class Main
{
  public static void main(String []args)
  {

    System.out.println();
    System.out.println("This is Rock, Paper, Scissors game (RPS game) ");
    System.out.print("Please enter an action.(Rock, Paper or Scissor.");
    System.out.println("Rock = R, Paper = P, and Scissors = S.)");

    Player p1 = new Player();  //give the Player method
    p1.Info();
    p1.Action();
    
    Referee r1 = new Referee();
    String play1 = r1.humanaction(); //recall the humanaction
    String play2 = r1.computeraction(); //recall the computeraction
    r1.Judge(play1,play2); //put into judge
    System.out.println(); 
  }
}