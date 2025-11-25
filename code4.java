import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read an integer
        int myInt = scanner.nextInt();
        
        // Read a double
        double myDouble = scanner.nextDouble();
        
        // Consume the leftover newline from nextInt/nextDouble
        scanner.nextLine();
        
        // Read a string (full line)
        String myString = scanner.nextLine();
        
        // Print the output in the required format
        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
        
        scanner.close();
    }
}

