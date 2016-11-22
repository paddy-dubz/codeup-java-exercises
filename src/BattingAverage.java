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






//    public static void main(String[] args) {
//        int  hits, bases, at_bats;
//        double batting_average, slugging_average;
//        Scanner keyboard=new Scanner(System.in);
//
//        System.out.print("Enter the number of at bats: ");
//        at_bats=keyboard.nextInt();
//        System.out.print("Enter the number of hits: ");
//        hits=keyboard.nextInt();
//        System.out.print("Enter the number of bases earned: ");
//        bases=keyboard.nextInt();
//
//        batting_average = ((double) hits /  at_bats);
//        slugging_average= ((double) bases / at_bats);
//
//        System.out.println("The batting average is:" + batting_average);
//        System.out.println("The slugging average is:" + slugging_average);
//    }
//}
//
//    public double average(int[] data) {
//        int sum = 0;
//
//        for(int i=0; i < data.length; i++)
//
//            sum = sum + data[i];
//        double average = sum / data.length;;
//
//        System.out.println("Average value of array element is " + average);
//    }
