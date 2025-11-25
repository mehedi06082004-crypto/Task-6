import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        
        // Read three lines of input
        for (int i = 0; i < 3; i++) {
            String s = scanner.next();
            int x = scanner.nextInt();
            
            // Print formatted output: left-justify string in 15 chars, integer with 3 digits padded with zeros
            System.out.printf("%-15s%03d%n", s, x);
        }
        
        System.out.println("================================");
        scanner.close();
    }
}
