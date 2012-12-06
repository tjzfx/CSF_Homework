import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorldArray {
	public static void askNames() {
		ArrayList<String> namesArray = new ArrayList<String>();
		
		for (int i = 1; i < 5; i++) {
			System.out.print("Your name:");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.next();
			namesArray.add(name);
			for (int j = 0; j < namesArray.size(); j++) {
				System.out.println("Hello, " + namesArray.get(j) + "!");
			}
		}
	}
}
