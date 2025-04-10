import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String tekstenter = scanner.nextLine();
        System.out.println("Hello, " + tekstenter);
        scanner.close();
    }
}