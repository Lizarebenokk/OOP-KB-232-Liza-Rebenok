public class Task11 {
    public static int sum(int[] array) {

        if (array == null || array.length == 0) {
            return 0;
        }
        
        int sumpar = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumpar += array[i];
            }
        }
        
        return sumpar;
    }
    
    public static void main(String[] args) {
        int[] values = {7, 5, 4, 2, 8, 1, 3};
        
        int sumnum = sum(values);
        System.out.println("Sum of even numbers in an array: " + sumnum);
    }
}