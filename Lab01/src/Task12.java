import java.util.Arrays;
 
 public class Task12 {
 
     public static void main(String[] args) {
         int[] values = {1, -1, 0, 4, 6, 10, 15, 25};
 
         System.out.println(Arrays.toString(getSumCheckArray(values)));
 
     }
 
     private static boolean[] getSumCheckArray(int[] values) {
         boolean[] result = new boolean[values.length];
 
         for (int i = 2; i < values.length; ++i) {
             if (values[i-2] + values[i-1] == values[i]) {
                 result[i] = true;
             }
             else {
                 result[i] = false;
             }
         }
 
         return result;
     }
 
 }

