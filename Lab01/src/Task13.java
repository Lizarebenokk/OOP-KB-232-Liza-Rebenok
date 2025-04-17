import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Task13 {

    public static void main(String[] args) {
        int[] values = {18, 1, 3, 6, 7, -5};
        System.out.println("original: " + Arrays.toString(values));
        System.out.println("removed: " + Arrays.toString(removeLocalMaxima(values)));
    }

    private static int[] removeLocalMaxima(int[] values) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            boolean isMax = false;

            if (i == 0 && values[i] > values[i + 1]) isMax = true;
            else if (i == values.length - 1 && values[i] > values[i - 1]) isMax = true;
            else if (i > 0 && i < values.length - 1 &&
                     values[i] > values[i - 1] && values[i] > values[i + 1]) isMax = true;

            if (!isMax) result.add(values[i]);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
