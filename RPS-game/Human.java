import java.util.Scanner;


public class Human extends Player
{

  public Human()
  {
    super();
  }


  public String performMove() //override from player class
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Hi, player!! What is your name?");
    String name= input.next();
    System.out.print(name + "! Please enter your play: ");
    humanplayer = input.next();
    humanplayer = humanplayer.toUpperCase(); //Make user input uppercase to compare with computer
    
    return humanplayer;
  }

  public void Action() 
  {
    System.out.println("Player gives an action!  " + humanplayer + "  !!");
  }
}