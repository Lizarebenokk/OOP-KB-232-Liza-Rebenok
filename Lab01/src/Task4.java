import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strangers: ");
        int numstrang = scanner.nextInt();

        if (numstrang <= 0) {
            System.out.println("Number must be greater than 0");
        } else {
            scanner.nextLine();
            for (int i = 0; i < numstrang; i++) {
                System.out.print("Enter the stranger's name "+ i + ": ");
                String name = scanner.nextLine();
                System.out.println("Hello, " + name);
            }
        }

        scanner.close();
    }
}
