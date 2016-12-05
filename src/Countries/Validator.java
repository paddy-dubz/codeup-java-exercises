package Countries;

import java.util.Scanner;

/**
 * Created by Patrick on 12/5/16.
 */
public class Validator {
    public static int getInt(String prompt, Scanner s) {
        int q;
        while(true) {
            System.out.println(prompt);
            if(s.hasNextInt()) {
                q = s.nextInt();
                s.nextLine();
                return q;
            }
            s.nextLine();
            System.out.println("That is a letter, and not a menu option.");
        }
    }

    public static int getIntWithinRange(String prompt, Scanner s, int min, int max) {
        int input;
        while(true) {
            input = getInt(prompt, s);
            if(input < min)
                System.out.println(input + " is too low, and not a menu option.");
            else if (input > max)
                System.out.println(input + " is too high, and not a menu option.");
            else
                return input;
        }
    }
}
