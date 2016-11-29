import java.util.Arrays;
import java.util.Scanner;
import java.lang.Comparable;

public class StudentSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents;
        int counter = 0;

        System.out.println("Please enter the number of students: ");
        numberOfStudents = sc.nextInt();
        Student[] students = new Student[numberOfStudents];

        while (counter < numberOfStudents) {
            System.out.println("Please enter student " + (counter + 1) + "'s " + "full name: ");
            String studentFirstName = sc.next();
            String studentLastName = sc.next();

            System.out.println("Please enter student " + (counter + 1) + "'s " + "score: ");
            int score = sc.nextInt();

            Student student = new Student();
            student.setFirstName(studentFirstName);
            student.setLastName(studentLastName);
            student.setScore(score);

            students[counter] = student;

            counter++;
        }

        System.out.println();

        Arrays.sort(students);

        for(Student student : students) {
            if(student != null) {
                System.out.print(student.getLastName() + ", " + student.getFirstName() + ": " + student.getScore());
                System.out.println();
            }
        }
        sc.close();
    }

    public static class Student implements Comparable {
        private String firstName;
        private String lastName;
        private int score;

        public Student(){
        }

        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public int getScore() {
            return score;
        }
        public void setScore(int score) {
            this.score = score;
        }

        public int compareTo(Object o) {
            Student s = (Student) o;

            int compare = getLastName().compareTo(s.getLastName());
            if(compare == 0){
                compare = getFirstName().compareTo(s.getFirstName());
            }
            return compare;
        }
    }
}
