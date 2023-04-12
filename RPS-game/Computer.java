import java.util.Random;

public class Computer extends Player
{
  public Computer()
  {
    super();
  }

  
  public void Action() 
  {
    System.out.println("Computer is giving an action...");
  }

  //Override the method from Player class
  public String performMove()
  {
    Random rps = new Random();
    int com = rps.nextInt(3);
    String computerplayer = "";

    if(com==0)
    {
      computerplayer = "R"; //Rock
    }
    else if (com==1)
    {
      computerplayer = "P"; //Paper
    }
    else if (com==2)
    {
      computerplayer = "S"; //Scissor
    }

    System.out.println("Computer has: " + computerplayer);
    return computerplayer;
  }
}