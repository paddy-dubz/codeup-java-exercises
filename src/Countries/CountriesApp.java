package Countries;

import java.util.Scanner;
import java.io.*;

/**
 * Created by Patrick on 12/5/16.
 */
public class CountriesApp {
    public static void main(String[] args) throws IOException {
        CountriesTextFile t = new CountriesTextFile();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to CountriesApp!\n");

        while(true) {
            choice = Validator.getIntWithinRange("Here are the menu options:\n 1. Read countries from file\n 2. Write countries to file\n 3. Exit ", sc, 1, 3);
            if (choice == 1) {
                t.makeFileReader();
                t.readCountries();
                t.closeRead();

            } else if (choice == 2) {
                t.makeFileWriter();
                t.writeCountries("Enter the name of the country you would like to add: ");
                t.closeWrite();

            } else if (choice == 3) {
                System.out.println("Thank you for using CountriesApp, goodbye!");
                System.exit(0);
            }
        }
    }
}
