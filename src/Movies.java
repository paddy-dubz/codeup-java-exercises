/**
 * Created by Patrick on 11/30/16.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Movies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        int input;
        String category = "";
        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            movies.add(Movie.getMovie(i));
        }

        System.out.println("Welcome to movie search!");

        Collections.sort(movies);

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter 1 for animated, 2 for drama, 3 for horror, and 4 for sci-fi: ");

            try {
                input = sc.nextInt();

                if (input > 0 && input < 5) {
                    if (input == 1) {
                        category = "animated";
                    }
                    if (input == 2) {
                        category = "drama";
                    }
                    if (input == 3) {
                        category = "horror";
                    }
                    if (input == 4) {
                        category = "scifi";
                    }
                } else {
                    System.out.println(input + " is not an option!");
                    System.out.println();
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                System.out.println();
                sc.nextLine();
                continue;
            }

            for (Movie movie : movies) {
                if (category.equals(movie.category)) {
                    System.out.println(movie.title);
                }
            }

            System.out.println("Search another category? (y/n): ");
            choice = sc.next();
        }
        System.out.println("Thanks for looking!");

    }

    @SuppressWarnings("WeakerAccess")
    public static class Movie implements Comparable {
        public String title;
        public String category;

        public Movie(String title, String category)
        {
            this.title = title;
            this.category = category;
        }

        public static Movie getMovie(int index) {
            switch (index) {
                case 1:
                    return new Movie("Terminator 2: Judgement Day", "scifi");
                case 2:
                    return new Movie("Wall-E", "animated");
                case 3:
                    return new Movie("Aliens", "scifi");
                case 4:
                    return new Movie("Zootopia", "animated");
                case 5:
                    return new Movie("Fountain, The", "drama");
                case 6:
                    return new Movie("Alien", "horror");
                case 7:
                    return new Movie("Abyss, The", "scifi");
                case 8:
                    return new Movie("Willies, The", "horror");
                case 9:
                    return new Movie("Gravity", "drama");
                case 10:
                    return new Movie("Up", "animated");
                default:
                    return new Movie("","");
            }
        }

        public int compareTo(Object o) {
            Movie m = (Movie) o;
            return this.title.compareToIgnoreCase(m.title);
        }
    }
}