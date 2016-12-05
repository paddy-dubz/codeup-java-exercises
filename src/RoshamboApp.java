import java.util.Random;
import java.util.Scanner;

public class RoshamboApp {
    public static void main(String args[]) {
        String choice = "y";
        Player p = null;
        String name;
        String playerChoice;
        String rps;

        Rick r = new Rick();
        Morty m = new Morty();
        System.out.println("Let's play some riggity roshambo son!\n");

        name = Validator.getInput("What should I call you?\n");

        playerChoice = Validator.getTeam("Would you like to play Rick or Morty? (R/M): ");

        if (playerChoice.equalsIgnoreCase("r")) {
            p = r;
            playerChoice = "Rick";
        }
        else if (playerChoice.equalsIgnoreCase("m")) {
            p = m;
            playerChoice = "Morty";
        }

        p.setName(playerChoice);

        while (choice.compareTo("y") == 0) {
            rps = Validator.getPlay("Rock, paper or scissors? (R/P/S): ");

            Player1 p1 = new Player1();
            p1.setName(name);
            p1.setResponse(rps);

            if (rps.equalsIgnoreCase("r")) rps = "Rock";
            else if (rps.equalsIgnoreCase("p")) rps = "Paper";
            else if (rps.equalsIgnoreCase("s")) rps = "Scissors";
            System.out.println(name + ": " + rps);

            String roshambo = p.generateRoshambo().toString();
            System.out.println(p.getName() + ": " + roshambo);

            if (rps.equals(roshambo)) System.out.println("Draw!");
            else if (rps.equals("Paper") && roshambo.equals("Rock")) System.out.println(p1.getName() + " Wins");
            else if (roshambo.equals("Paper") && rps.equals("Rock")) System.out.println(p.getName() + " Wins!");
            else if (rps.equals("Paper") && roshambo.equals("Scissors")) System.out.println(p.getName() + " Wins!");
            else if (roshambo.equals("Paper") && rps.equals("Scissors")) System.out.println(p1.getName() + " Wins!");
            else if (rps.equals("Scissors") && roshambo.equals("Rock")) System.out.println(p.getName() + " Wins");
            else if (roshambo.equals("Scissors") && rps.equals("Rock")) System.out.println(p1.getName() + " Wins!");

            choice = Validator.getContinue("Play again? (Y/N): ");
            System.out.println();
        }
    }
}

class Rick extends Player {
    public Rick() {
        name = "Rick";
    }

    @Override
    public Roshambo generateRoshambo() {
        return Roshambo.ROCK;
    }
}


class Morty extends Player {
    public Morty() {
        name = "Morty";
    }

    @Override
    public Roshambo generateRoshambo() {
        Random r = new Random();
        int choice = r.nextInt(3);
        if (choice == 0) return Roshambo.ROCK;
        else if (choice == 1) return Roshambo.PAPER;
        else return Roshambo.SCISSORS;
    }
}

abstract class Player {

    public String name;
    public String response;

    public Player() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public abstract Roshambo generateRoshambo();
}

class Player1 extends Player {
    public Player1() {
        super();
    }

    @Override
    public Roshambo generateRoshambo() {
        if (response.equalsIgnoreCase("r")) return Roshambo.ROCK;
        if (response.equalsIgnoreCase("p")) return Roshambo.PAPER;
        return Roshambo.SCISSORS;
    }
}

enum Roshambo {
    ROCK,
    PAPER,
    SCISSORS;

    @Override
    public String toString() {
        if (this.ordinal() == 0) return "Rock";
        if (this.ordinal() == 1) return "Paper";
        if (this.ordinal() == 2) return "Scissors";
        return "";
    }
}

class Validator {

    public static String getInput(String prompt) {
        String s = "";
        boolean isValid = false;
        Scanner sc = new Scanner(System.in);
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (!s.equals(""))
                isValid = true;
        }
        return s;
    }

    public static String getTeam(String prompt) {
        String s = "";
        boolean isValid = false;
        Scanner sc = new Scanner(System.in);
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equalsIgnoreCase("r") || s.equalsIgnoreCase("m"))
                isValid = true;
            else
                System.out.println("Please enter either 'r' for Rick or 'm' for Morty!");
        }
        return s;
    }

    public static String getPlay(String prompt) {
        String s = "";
        boolean isValid = false;
        Scanner sc = new Scanner(System.in);
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equalsIgnoreCase("r") || s.equalsIgnoreCase("p") || s.equalsIgnoreCase("s"))
                isValid = true;
            else
                System.out.println("That's not an option! Use your brain this time and try again.");
        }
        return s;
    }

    public static String getContinue(String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getInput(prompt);
            if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n"))
                isValid = true;
            else
                System.out.println("You dingus, enter 'y' for yes or 'n' for no!");
        }
        return s;
    }
}