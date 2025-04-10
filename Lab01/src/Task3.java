import java.util.Scanner;

public class Task3 {
    private final static int password = 39;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        int input = scanner.nextInt();
        scanner.close();

        if (input == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
