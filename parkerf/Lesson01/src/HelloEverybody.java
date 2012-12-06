import java.util.Scanner;
import java.util.ArrayList;

/* create a method that asks for a name, 
 * adds it to a list, then says " 'Hi' + name "
 * then it asks for a name again, and says "Hi" + all the other names....
 * 
 */

public class HelloEverybody {
	public void hiEverybody()
	{
		ArrayList<String> names = new ArrayList<String>();
		int i = 0;
		for (i = 0; i <= 10; i++);
		System.out.print("What's your name?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		names.add(name);
		System.out.print("Hi there " + names.get(i));
		
	
	}

}
 