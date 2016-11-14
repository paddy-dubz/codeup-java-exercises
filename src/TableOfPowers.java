import java.util.Scanner;

public class TableOfPowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int square;
        int cube;
        String choice;

        do {
            System.out.print("Enter an integer: ");

            int integer = sc.nextInt();

            System.out.println("Squares" + " " + "Cubes");

            for (int i = 1; i <= integer; i++) {
                square = i * i;
                cube = i * i * i;
                System.out.println(square + "       " + cube);
            }

            System.out.print("Continue (y/n)?: ");

            choice = sc.next();

            System.out.println();

        } while (!choice.equalsIgnoreCase("n"));
    }
}
