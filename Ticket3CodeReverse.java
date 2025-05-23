import java.util.Collections;
import java.util.List;

public class Ticket3CodeReverse {

    private Ticket3CodeReverse() {}

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void reverseInPlace(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static <T> void reverseList(List<T> list) {
        Collections.reverse(list);
    }
}
