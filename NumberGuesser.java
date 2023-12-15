import java.util.Scanner;
public class NumberGuesser
{
  public static void main(String[] args)
  {
    System.out.println("Think of a number between 1 and 100. \nI can guess it in 7 guesses or less!");
    int min = 1, max = 100;
    int guess = (min+max)/2;
    Scanner s = new Scanner(System.in);
    System.out.println("My first guess is "+guess);
    String answer = "";
    int guesses = 1;
    while (!answer.equals("yes"))
      {
        System.out.println("Is it "+guess+"? (answer must be, \"too high, too low, yes\")");
        answer = s.nextLine();
        if (answer.equals("too high")
        {
          min = (min+ max)/2;
          guess = (min+ max)/2;
        }
        if (answer.equals("too low")
        {
          max = (min+ max)/2;
          guess = (min+ max)/2;
        }
        if (answer.equals("yes"))
          System.out.println("I guessed it in "+guesses+"!");
        gusses++;
      }
  }
}
