public class DoWhile {
    public static void main(String[] args) {
        int counter = 100;
        do {
            System.out.println( " " + counter );
            counter = counter - 5;
        } while ( counter >= -10 );
    }
}
