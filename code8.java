import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1; // Start counting from 1

        // Read lines until EOF
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine(); // Read the next line
            System.out.println(lineNumber + " " + line); // Print line number and content
            lineNumber++; // Increment line number
        }

        scanner.close();
    }
}
