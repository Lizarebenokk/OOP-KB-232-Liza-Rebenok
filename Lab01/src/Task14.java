import java.util.Arrays;
 
 public class Task14 {
 
     public static void main(String[] args) {
         int[] values = {18, 1, 3, 6, 7, -5};
 
         cycleSwap(values);
         System.out.println("" + Arrays.toString(values));
 
         cycleSwap(values, 3);
         System.out.println("" + Arrays.toString(values));
     }
 
     private static void cycleSwap(int[] array) {
         int[] copy = array.clone();
         int place = 0;
 
         for (int i = 0; i < array.length; ++i) {
             if (i == array.length-1) {
                 place = 0;
             }
             else {
                 place = i+1;
             }
             array[place] = copy[i];
         }
     }
 
     private static void cycleSwap(int[] array, int shift) {
         int[] copy = array.clone();
         int place = 0;
 
         for (int i = 0; i < array.length; ++i) {
             if (i+shift >= array.length) {
                 place = i + shift - array.length;
             }
             else {
                 place = i+shift;
             }
             array[place] = copy[i];
         }
     }
 
 }
