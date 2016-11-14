public class DoWhile {
    public static void main(String[] args) {
        long counter = 2;
        do {
            System.out.println(counter);
            counter *= counter;
        } while (counter <= 1000000);
    }
}
