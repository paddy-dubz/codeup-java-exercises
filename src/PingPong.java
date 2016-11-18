import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PingPong {
    public static void main(String[] args) {

        boolean correct = true;
        Scanner userInput = new Scanner(System.in);
        int userPick;
        int userScore = 0;
        int cpuScore = 0;

        System.out.println("WELCOME TO SUDDEN DEATH PING PONG! First player to miss LOSES!\n");

        while (correct && userScore <= 7 && cpuScore <= 7) {
            int tableSide = new Random().nextInt(2);
            int cpuChoice = new Random().nextInt(2);

            System.out.println("Which side of the table would you like to swing your paddle? (0 is left, 1 is right): ");

            try {
                userPick = userInput.nextInt();

                if (userPick == tableSide) {
                    userScore++;
                    System.out.println("Your score is " + userScore +"\n");
                    System.out.println("Now it's the CPU's turn");
                    if (cpuChoice == tableSide) {
                        cpuScore++;
                        correct = true;
                        System.out.println("The CPU hit the ball! Its score is " + cpuScore + "\n");
                    } else {
                        correct = false;
                        System.out.println("The CPU missed the ball! You win! Your score was " + userScore);
                    }
                } else {
                    correct = false;
                    System.out.println("Gameover! Your score was " + userScore);
                }

            } catch (InputMismatchException e) {
                System.out.println("Not an option!");
                userInput.nextLine();
                correct = true;
            }
        }
    }
}
