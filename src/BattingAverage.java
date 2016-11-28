import java.text.DecimalFormat;
import java.util.Scanner;

public class BattingAverage {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".000");
        double bases = 0;
        double avg = 0;

        System.out.print("Enter the number of at bats: ");
        int atBats = scan.nextInt();

        int arrayOfBases[] = new int[atBats];
        for (int i = 0; i < arrayOfBases.length; i++) {
            System.out.print("Enter the number of bases earned at bat " + (i+1) + " : ");
            arrayOfBases[i] = scan.nextInt();
            bases += arrayOfBases[i];
            if (arrayOfBases[i] > 0) {
                avg++;
            }
        }

        double average = avg/atBats;
        System.out.println("Batting average is " + df.format(average));

        double percentage = bases/atBats;
        System.out.println("Slugging percentage is " + df.format(percentage));
    }
}