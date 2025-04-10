import java.util.Scanner;
 
 public class Task7 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter integer values: ");
         String[] input = scanner.nextLine().split(" ");
 
         int max = 0;
         int value;
 
         for (String s : input) {
             value = Integer.parseInt(s);
             if (value == 0) break;
             if (value > max) {
                 max = value;
             }
         }
 
         System.out.println("The max value: " + max);
 
         scanner.close();
     }
 
 }
