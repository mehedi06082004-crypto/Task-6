import java.util.Scanner;

public class PrintIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integers until there is no more input
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println(number);
        }

        scanner.close();
    }
}
