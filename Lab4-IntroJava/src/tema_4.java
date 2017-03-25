/**
 * Created by aaronmarton on 23/03/2017.
 *
 * given a list of numbers, determine the largest number (max)
 *
 */
public class tema_4 {
    public static void main(String[] args) {
        int[] list_of_numbers = {3, 45, 32, 12, 34, 5, 66, 7, 43, 67, 87, 5, 2};
        int max = list_of_numbers[0];

        for (int i : list_of_numbers) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Largest number is: " + max);
    }
}
