import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficients a, b, c: ");
        String[] input = scanner.nextLine().split(" ");

        if (input.length != 3) {
            System.out.println("Error: 3 numbers!");
            scanner.close();
        }

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int discr = b * b - 4 * a * c;

        if (discr > 0) {
            double x1 = (-b - Math.sqrt(discr)) / (2 * a);
            double x2 = (-b + Math.sqrt(discr)) / (2 * a);
            System.out.println(x1 + " " + x2);

        } else if (discr == 0) {
            double x = -b / (2 * a);
            System.out.println(x);

        } else {
            System.out.println("no roots");
        }

        scanner.close();
    }
}