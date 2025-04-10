import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter integer values: ");
         String[] input = scanner.nextLine().split(" ");
 
         int sum = 0;
         int count = 0;
 
         for (String s : input) {
            int value = Integer.parseInt(s);
            if (value == 0) break;

            sum += value;
            count++;
        }

        if (count > 0) {
            int average = sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("Error");
        }

        scanner.close();
        }
}
