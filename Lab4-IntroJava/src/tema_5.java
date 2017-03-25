import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aaronmarton on 23/03/2017.
 *
 * given a list of numbers, determine all the odds
 *
 */
public class tema_5 {
    public static void main(String[] args) {

        int[] list_of_numbers = {3, 45, 32, 12, 34, 5, 66, 7, 43, 67, 87, 5, 2};
        List<Integer> odd_numbers = new ArrayList<Integer>();

        for (int i = 0; i < list_of_numbers.length; i++) {

            if ((list_of_numbers[i] % 2 != 0 && list_of_numbers[i] != 0) ) {
                odd_numbers.add(list_of_numbers[i]);
            }
        }

        System.out.println("\n" + Arrays.toString(odd_numbers.toArray()) + " are odd numbers.");
    }
}
