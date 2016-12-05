package Countries;

import java.util.Scanner;
import java.io.*;

/**
 * Created by Patrick on 12/5/16.
 */
public class CountriesTextFile {
    BufferedWriter bw;
    Scanner sc;
    FileReader fr;
    BufferedReader b;
    FileWriter w;
    PrintWriter p;


    public CountriesTextFile() {
        sc = new Scanner(System.in);
    }

    public void readCountries() throws IOException {
        String line;
        try {
            while ((line = b.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(NullPointerException e) {
            System.out.println("Error!");
        }
    }

    public void makeFileReader() throws IOException {
        while(true) {
            try {
                fr = new FileReader("countries.txt");
                b = new BufferedReader(fr);
                break;
            } catch (FileNotFoundException e) {
                makeFileWriter();
                closeWrite();
            }
        }
    }

    public void makeFileWriter() throws IOException {
        while(true)
            try {
                w = new FileWriter("countries.txt", true);
                bw = new BufferedWriter(w);
                p = new PrintWriter(bw);
                break;
            } catch (IOException e) {
                System.out.println("Error!");
                File file = new File("countries.txt");
                w = new FileWriter(file, true);
                bw = new BufferedWriter(w);
                p = new PrintWriter(bw);
            }
    }

    public void writeCountries(String prompt) throws IOException {
        System.out.println(prompt);
        p.println(sc.nextLine());
    }

    public void closeWrite() throws IOException {
        System.out.println();
        p.close();
    }

    public void closeRead() throws IOException {
        System.out.println();
        b.close();
    }
}
