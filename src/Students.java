import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Students {
    private static String[] students = {"John", "Ben", "Lisa", "Stewart", "Cora"};
    private static int[] grades = {79, 86, 90, 89, 99};
    private static String[] behavior = {"aggressive", "distractable", "attentive", "disruptive", "angelic"};
    private static List myList = Arrays.asList(students);


    public static void main(String args[]) {

        Scanner kb = new Scanner(System.in);
        boolean userChoice = true;
        String userInput;
        String choice;

        while(userChoice) {

            System.out.println(myList);

            System.out.println("Please enter a student's name (case-sensitive) to get their progress report: ");

            userInput = kb.nextLine();

            try {
                if (myList.contains(userInput)) {
                    getGrades(userInput);
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Not a valid student's name");
            }

            System.out.println("Would you like to enter another student's name? (y/n)");

            choice = kb.nextLine();

            if (choice.equalsIgnoreCase("n")) {
                userChoice = false;
            }
        }
    }

    private static void getGrades(String userInput) {
        for(int i = 0; i < students.length; i++) {
            if(userInput.equals(students[i])) {
                System.out.println(userInput + "'s " + "grade is " + grades[i] + " and they are " + behavior[i]);
            }
        }
    }
}
