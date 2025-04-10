import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int sec = scanner.nextInt();
        scanner.close();

        int hours = (sec / 3600) % 24;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;

        System.out.printf("Time: %d:%02d:%02d%n", hours, minutes, seconds);
    }
}
