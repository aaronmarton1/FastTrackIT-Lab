import java.text.DecimalFormat;

/**
 * Created by aaronmarton on 23/03/2017.
 *
 * you are given n numbers; calculate their average
 *
 */
public class tema_3 {
    public static void main(String[] args) {

        double num_1;
        double entered_num = 0;
        double num_n = 0;
        double avg;
        int number_of_entered_numbers = 1;
        DecimalFormat numberFormat = new DecimalFormat("#.0");

        System.out.println("\n\n\n***** NOTE: to exit this application, just enter any negative number. *****\n");

        // read the first number from the user input
        num_1 = SkeletonJava.readDoubleConsole("Enter a number: ");

        // continue reading numbers from the user, while they enter a negative number, which is out condition to break the loop
        while (entered_num >= 0) {

            // how many numbers were entered by the user
            number_of_entered_numbers++;

            // store the entered number in a (double) variable
            entered_num = SkeletonJava.readDoubleConsole("Enter another number: ");

            // in case this is the first iteration if the loop, add the first entered number to the 2nd entered numebr
            if (number_of_entered_numbers == 2) {
                // store the sum of entered numbers in a (double) variable
                num_n = num_1 + entered_num;
            } else {
                // just keep adding the value of the nth enterd number to the sum of all entered numbers
                num_n += entered_num;
            }

            // calculate the average of the entered numbers
            avg = (double) (num_n / number_of_entered_numbers);

            // display the number of entered numbers as well as the avearage of those numbers to the user
            System.out.println("\n----> " + number_of_entered_numbers + " number(s) entered so far, their average is: " + numberFormat.format(avg) + "\n");
        }

        System.out.println("Thank you for using Aaron's avrerage number calculator!");
    }
}
