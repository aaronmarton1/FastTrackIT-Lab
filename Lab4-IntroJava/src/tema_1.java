import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.text.DecimalFormat;

/**
 * Created by aaronmarton on 23/03/2017.
 *
 * you are given a temperature in F; covert it in C; C= 5/9 *(F-32)
 *
 */
public class tema_1 {
    public static void main(String[] args) {

        double temperature_f = SkeletonJava.readDoubleConsole("Enter temperature in Fahrenheit: ");
        double temperature_c;
        DecimalFormat numberFormat = new DecimalFormat("#.0");

        temperature_c = ((float)5/9) * (temperature_f - 32);

        System.out.println("\n" + numberFormat.format(temperature_f)  + " Fahrenheit = " + numberFormat.format(temperature_c) + " Celsius");

    }
}
