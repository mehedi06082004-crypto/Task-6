import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the input integer
        scanner.close();
        
        if (n % 2 == 1) {
            // If n is odd
            System.out.println("Weird");
        } else {
            // If n is even
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    } // Closing brace for main method
} // Closing brace for class
