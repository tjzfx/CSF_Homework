import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by tjz on 16/12/13.
 */
public class RandomName {
    public static void main(String args[]) {
        //private static final int MAX_RANDOM_VALUE = 2;
        //private static final int DEFAULT_ARRAY_SIZE = 10;

        String classMates[] = {
                "Kevin", "Ernie", "Marine", "Granger", "Shirley", "Fred", "Rachel", "Mandeep", "Hunter", "TJ"
        };

        Random random1 = new Random();
        Random random2 = new Random();

        //TODO ask for enter key to keep running for more pairing
        //Scanner scanner = new Scanner(System.in);

        String p1 = classMates[random1.nextInt(classMates.length)];
        String p2 = classMates[random2.nextInt(classMates.length)];

        //TODO run again if matched pair
        if (p1.equals(p2)) System.out.println("Matched pair please run again");

        System.out.println("The team is: " + p1 + " and " + p2);
    }

}
