

/*
	ISYS 320
	Name(s): Dave Rapp
	Date: 4-18-18
	
	if (guessesTaken > secretNumber)
                System.out.println("Your guess is too high!");
            else if (guessesTaken  < secretNumber)
                System.out.println("Your guess is too low!");
*/


import java.util.Random;
import java.util.Scanner;
public class P2_InfiniteGuessingGame
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        long from = 1;
        long to = 100;
        long randomNumber = random.nextInt() + from;
        int guessedNumber = 0;
 
        System.out.printf("The number is between %d and %d.\n", from, to);
 
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber < randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber > randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
}
