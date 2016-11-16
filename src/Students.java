    import java.util.Arrays;
    import java.util.List;
    import java.util.Scanner;

    public class Students {
        private static List studentsList = Arrays.asList("John", "Ben", "Lisa", "Stewart", "Cora");
        private static int[] grades = {79, 86, 90, 89, 99};
        private static String[] behavior = {"aggressive", "distractable", "attentive", "disruptive", "angelic"};


        public static void main(String args[]) {

            Scanner kb = new Scanner(System.in);
            boolean userChoice = true;
            String userInput;
            String choice;

            while(userChoice) {

                System.out.println(studentsList);

                System.out.println("Please enter a student's name (case-sensitive) to get their progress report: ");

                userInput = kb.nextLine();

                try {
                    getGrades(userInput);
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
            for(int i = 0; i < studentsList.size(); i++) {
                if(studentsList.contains(userInput)) {
                    if (userInput.equals(studentsList.get(i))) {
                        System.out.println(userInput + "'s " + "grade is " + grades[i] + " and they are " + behavior[i]);
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }
