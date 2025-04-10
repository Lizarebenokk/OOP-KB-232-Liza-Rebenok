import java.util.Scanner;
 
 public class Task6 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the number of friends: ");
        int friends = scanner.nextInt();

        if (amount <= 0) {
            System.out.print("The amount cannot be negative");
        } else if (friends <= 0) {
            System.out.print("Number of friends must be greater than 0");
        } else {
            double tip = amount * 1.1;
            double person = tip / friends;
            System.out.println("Everyone has to pay: " + Math.round(person));
        }

        scanner.close();
     }
 
 }
