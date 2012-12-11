import java.util.Scanner;


public class HelloWorldPrinter {
	
	public String getName() {
		
		System.out.print("Your name:");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    return name;
	}
	
	public void sayHello(String name) {
		
		System.out.println("Hello " + name + "!");
	}

}

