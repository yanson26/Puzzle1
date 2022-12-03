import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Puzzle1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Puzzle1.txt"));
        StringBuilder sb = new StringBuilder();

        while(in.hasNext()) {
            sb.append(in.next());
            sb.append(" ");


        }
        in.close();
        String realString = sb.toString();

        System.out.println(realString);
        String S = "Hallo na wie gehts?";
    }
}
