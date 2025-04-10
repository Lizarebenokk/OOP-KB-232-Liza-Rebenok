import java.util.Scanner;
 
 public class Task5 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a (for the day): ");
        int a = scanner.nextInt();
        System.out.print("Enter b (for the night): ");
        int b = scanner.nextInt();
        System.out.print("Enter h (tree height): ");
        int h = scanner.nextInt();

        if (a <= b) {
            System.out.println("Impossible");
        } else {
            int days = (h - a) / (a - b);
            if ((h - a) % (a - b) != 0) {
                days++;
            }
            days++;

            System.out.println("A snail needs " + days + " days");
        }

        scanner.close();
    }
 
 }
