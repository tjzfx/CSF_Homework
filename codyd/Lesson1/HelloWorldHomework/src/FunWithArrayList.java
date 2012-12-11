import java.util.Scanner;
import java.util.ArrayList;


public class FunWithArrayList {
	
	public ArrayList<String> getNames() {
		
		ArrayList<String> names = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(true) {
			System.out.println("Please enter your name ('exit to quit'): ");
			name = scanner.next();
			if (name.equals("exit") || name.equals("Exit") ){
				return names;
			}
			names.add(name);
		}
	}
	
	public void printNames(ArrayList<String> allnames) {
		int listcount = allnames.size();
		System.out.print("Hello ");
		for (int x = 0; x < listcount; x++) {
			String onename = allnames.get(x);
			System.out.print(onename + " ");
		}
	}
}
