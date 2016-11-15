import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter a number from 1-10 to find the factorial: ");

            Integer input = scanner.nextInt();

            Long fact = 1L;

            if (input < 0 || input > 10) {
                System.out.print("You didn't listen to the instructions, goodbye!");
                break;
            }

            for (int i = 1; i <= input; i++) {
                fact += fact * i;
            }

            System.out.println(input + "!" + " = " + fact);

            System.out.print("Continue (y/n)?: ");

            choice = scanner.next();
        }
    }
}