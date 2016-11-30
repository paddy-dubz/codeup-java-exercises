/**
 * Created by Patrick on 11/30/16.
 */
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        boolean userChoice = true;
        String choice;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter desired radius to get circumference and area: ");
            double radius = sc.nextDouble();
            if (radius <= 0) {
                System.out.println("Must be greater than 0!");
                continue;
            }
            Circle circle = new Circle(radius);

            System.out.println("Circumference: ");
            System.out.println(circle.getCircumference());
            System.out.println("Area: ");
            System.out.println(circle.getArea());

            System.out.println("Would you like to enter another radius? (y/n)");

            choice = sc.next();

            if (choice.equalsIgnoreCase("n")) {
                userChoice = false;
                System.out.println("Goodbye!");
                System.out.println("You created " + circle.getObjectCount() + " circle(s)!");
            }
        } while (userChoice);
    }

    public static class Circle {
        private double radius;
        private static int count = 0;

        public Circle(double radius) {
            this.radius = radius;
            count++;
        }

        public double getCircumference() {
            return Math.round(2 * Math.PI * radius * 100) / 100.0;
        }

        public double getArea() {
            return Math.round(Math.PI * radius * radius * 100) / 100.0;
        }

        public int getObjectCount() {
            return count;
        }
    }
}


