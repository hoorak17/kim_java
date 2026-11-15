package Static2;

import java.util.Arrays;

public class MathArrayUtils {
    private MathArrayUtils() {
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }

    public static double average(int[] array) {
        validateNotEmpty(array);
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        validateNotEmpty(array);
        return Arrays.stream(array).min().getAsInt();
    }

    public static int max(int[] array) {
        validateNotEmpty(array);
        return Arrays.stream(array).max().getAsInt();
    }

    private static void validateNotEmpty(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
    }
}
