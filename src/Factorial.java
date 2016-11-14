import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from 1-10 to find the factorial: ");
        int n = scanner.nextInt();

        if (n <= 10) {

            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = result * i;
            }

            System.out.println(n + "!" + " = " + result);

        } else {
            System.out.print("You didn't listen to the instructions, goodbye!");
        }
    }
}