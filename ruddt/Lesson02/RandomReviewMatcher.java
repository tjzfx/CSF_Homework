import java.util.ArrayList;
import java.util.Random;

public class RandomReviewMatcher {
    ArrayList<String> names = new ArrayList<String>();
    Random generator = new Random();

    public RandomReviewMatcher() {
        names.add("Cody");
        names.add("David");
        names.add("Mansi");
        names.add("Dann");
        names.add("Jose");
        names.add("RyanBy");
        names.add("RyanBl");
        names.add("Parker");
    }

    public void printRandomMatches() {
        ArrayList<String> namesCopy = new ArrayList<String>(this.names);

        while (!namesCopy.isEmpty()) {
            String firstName = namesCopy.remove(this.generator.nextInt(namesCopy.size()));
            String secondName = namesCopy.remove(this.generator.nextInt(namesCopy.size()));

            if (namesCopy.size() == 1) {
                System.out.println("Match: " + firstName + " and " + secondName + " and " + namesCopy.remove(0));
            }
            else {
                System.out.println("Match: " + firstName + " and " + secondName);
            }
        }
    }
}
