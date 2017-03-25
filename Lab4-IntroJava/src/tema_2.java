import java.text.DecimalFormat;

/**
 * Created by aaronmarton on 23/03/2017.
 *
 * you are given 2 numbers; calculate their average
 *
 *
 */
public class tema_2 {
    public static void main(String[] args) {
        double num1 = SkeletonJava.readDoubleConsole("Enter the first number: ");
        double num2 = SkeletonJava.readDoubleConsole("Enter the second number: ");
        DecimalFormat numberFormat = new DecimalFormat("#.0");

        double avg = (double)((num1 + num2) / 2);

        System.out.println("The average of the two entered numbers is: " + numberFormat.format(avg));

    }
}
