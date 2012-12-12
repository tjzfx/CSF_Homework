import java.util.Scanner;

public class Lab3Samples {

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        System.out.print("\nEnter 'list' to start: ");
        String command = consoleScanner.next();
        if (command.equals("list")) {
            linkedList();
        }
        else {
            System.out.println("Invalid input, bailing");
        }
    }

    public static void linkedList() {
        IntLinkedList list =  new IntLinkedList();

        while(true) {
            Scanner consoleScanner = new Scanner(System.in);
            System.out.print("\nEnter {add/remove} number to modify the list: ");
            String command = consoleScanner.next();
            int value = consoleScanner.nextInt();

            if (command.equals("add")) {
                list.insert(value);
            }
            else if (command.equals("remove")) {
                list.remove(value);
            }

            list.print();
        }
    }
}