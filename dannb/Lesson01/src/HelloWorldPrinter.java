import java.util.Scanner;


public class HelloWorldPrinter {
	public static void sayHello() {
		System.out.print("Your age:");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if (age > 15 && age < 18) {
			System.out.println("You can drive!");
		} else if (age > 17 && age < 21) {
			System.out.println("You can vote!");
		} else if (age > 20) {
			System.out.println("You can drink!");
		} else {
			System.out.println("You're too young for anything!");
		}
	}
}
