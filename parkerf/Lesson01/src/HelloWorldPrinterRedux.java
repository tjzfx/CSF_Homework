import java.util.Scanner;


public class HelloWorldPrinterRedux {
	public void sayHello()
	{
		System.out.print("Your name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print("Your age:");
		int age = scanner.nextInt();
		if (age == 16 || age <= 17) System.out.println("Hello " + name + ", You you can drive!");
		else if (age == 18 || age <= 20 ) System.out.println("Hello " + name + ", You you can vote!");
		else if (age >= 21) System.out.println("Hello " + name + ", You you can drink!");
		else System.out.println("Hello " + name + "Sorry, the world doesn't think your brain is ready");
	
	}

}
