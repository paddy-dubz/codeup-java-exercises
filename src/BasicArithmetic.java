import java.util.Scanner;

public class BasicArithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int num1 = input.nextInt();

        System.out.print("Enter the second number:");
        int num2 = input.nextInt();

        System.out.println(num1 + "+" + num2 + "=" + addition(num1, num2));
        System.out.println(num1 + "-" + num2 + "=" + subtraction(num1, num2));
        System.out.println(num1 + "*" + num2 + "=" + multiplication(num1, num2));
        System.out.println(num1 + "/" + num2 + "=" + division(num1, num2));
        System.out.println(num1 + "/" + num2 + "=" + modulus(num1, num2));
    }

    private static int addition(int a, int b) {
        return (a+b);
    }

    private static int subtraction(int a, int b) {
        return (a-b);
    }

    private static int multiplication(int a, int b) {
        return (a*b);
    }

    private static int division(int a, int b) {
        return (a/b);
    }

    private static int modulus(int a, int b) {
        return (a%b);
    }
}
