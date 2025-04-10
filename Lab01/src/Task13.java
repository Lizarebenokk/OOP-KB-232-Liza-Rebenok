import java.util.Arrays;
 
 public class Task13 {
 
     public static void main(String[] args) {
         int[] values = {18, 1, 3, 6, 7, -5};
         System.out.println("original: " + Arrays.toString(values));
          System.out.println("removed: " + Arrays.toString(removeLocalMaxima(values)));
     }
 
     private static int[] removeLocalMaxima(int[] values) {
         int[] array = values.clone();
         return Arrays.stream(array).filter(i -> i < Arrays.stream(values).max().getAsInt()).toArray();
     }
 
 }
