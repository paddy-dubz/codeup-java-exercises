import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        int gamePick = new Random().nextInt(100);
        boolean win = false;
        Scanner userInput = new Scanner(System.in);
        int userPick;
        int userGuesses = 0;

        while (!win) {
            System.out.println("Guess a number between 1 and 100: ");

            try {
                userPick = userInput.nextInt();

                if (userPick > 0 && userPick < 101) {
                    if (userPick == gamePick) {
                        win = true;
                    } else if (userPick < gamePick) {
                        System.out.println("HIGHER");
                    } else if (userPick > gamePick) {
                        System.out.println("LOWER");
                    }
                } else {
                    System.out.println("You didn't listen to the instructions!");
                }

                userGuesses++;

            } catch (InputMismatchException e) {
                System.out.println("Not a number!");

                userInput.nextLine();

                win = false;
            }
        }
        System.out.println("GOOD GUESS! You got it right in " + userGuesses + " guesses!");
    }
}
