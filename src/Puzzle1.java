import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Puzzle1.txt"));

        int bestSum = 0;
        int currentSum = 0;
        while(in.hasNext()){
            String s = in.nextLine();
            if(s.equals("")){
                if(currentSum > bestSum){
                    bestSum = currentSum;
                }
                currentSum = 0;
            } else {
                int x = Integer.parseInt(s);
                currentSum += x;
            }
        }
        in.close();


        System.out.println(bestSum);
    }
}
