public class Referee
{
  

  //instantiate Players (Polymorphism)
  Player h1 = new Human();   //give the Human method
  Player c1 = new Computer(); //give the Computer method

  
  public String humanaction() //call the value from human
  {
    String draw1 = h1.performMove(); //User input first
    h1.Action(); 
    System.out.println();
    return draw1;
  }
  
  public String computeraction() // call the value from computer
  {
    c1.Action(); 
    String draw2 = c1.performMove(); //Show the computer random pick
    System.out.println();
    return draw2;
  }

  public static void Judge(String draw1, String draw2)
  { 
    System.out.println("----Here is the draw----");
    System.out.println("");

    if(draw1.equals(draw2))
    {
      System.out.println("No one win ~ It is tie!!");
    }
    else if(draw1.equals("R")) //Player got R
    {
      if(draw2.equals("S")) //Computer got S
      {
        System.out.println("Rock crushes Scissors. You win!!");
      }
      else //Computer got P
      {
        System.out.println("Paper covers Rock. You lose!!");
      }
    }
    else if(draw1.equals("P")) //Player got P
    {
      if(draw2.equals("R")) //Computer got R
      {
        System.out.println("Paper covers Rock. You win!!");
      }
      else //Computer got S
      {
        System.out.println("Scissors cuts Paper. You lose!!");
      }
    }
    else if(draw1.equals("S")) //Player got S
    {
      if(draw2.equals("P")) //Computer got R
      {
        System.out.println("Scissors cuts Paper. You win!!");
      }
      else //Computer got R
      {
        System.out.println("Rock crushes Scissors. You lose!!");
      }
    }
    else 
    {
      System.out.println("Invalid user input"); //if player input anything not "R,P,S"
    }
  return ;
  }
}