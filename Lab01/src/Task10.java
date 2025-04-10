import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] values = {7, 4, 9, 23, 1567, 9, 85, 67, 30, 12, 1};

        System.out.println("The max value: " + Arrays.stream(values).max().getAsInt());

    }

}