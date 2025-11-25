import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input integer
        int N = scanner.nextInt();
        scanner.close();
        
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}
