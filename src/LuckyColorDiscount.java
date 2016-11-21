/**
 * Created by Patrick on 11/21/16.
 */
import java.util.Scanner;

public class LuckyColorDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        discountPercentage randomColor = discountPercentage.getRandom();
        int total;

        System.out.println("Please input your total to get your discounted price: ");

        total = sc.nextInt();

        if (randomColor == discountPercentage.Blue) {
            System.out.println("You got blue!");
            double discount = total * .2;
            System.out.println("Your new total is " + discount);
        } else if (randomColor == discountPercentage.Red) {
            System.out.println("You got red!");
            double discount = total * .5;
            System.out.println("Your new total is " + discount);
        } else if (randomColor == discountPercentage.Yellow) {
            System.out.println("You got yellow!");
            double discount = total * .3;
            System.out.println("Your new total is " + discount);
        } else if (randomColor == discountPercentage.Green) {
            System.out.println("You got green!");
            double discount = total * .9;
            System.out.println("Your new total is " + discount);
        } else if (randomColor == discountPercentage.Purple) {
            System.out.println("You got purple!");
            double discount = total * .75;
            System.out.println("Your new total is " + discount);
        } else if (randomColor == discountPercentage.Pink) {
            System.out.println("You got pink!");
            System.out.println("You get no discount and your total is " + total);
        }
    }

    private enum discountPercentage {
        Red,
        Blue,
        Yellow,
        Green,
        Purple,
        Pink;

        public static discountPercentage getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }
}






