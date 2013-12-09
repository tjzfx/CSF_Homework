import java.util.Scanner;

public class HelloWorldPrinter {
    public void sayHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.next();

        System.out.print("\nYour age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ", you're " + age + " years old.");
    }
}