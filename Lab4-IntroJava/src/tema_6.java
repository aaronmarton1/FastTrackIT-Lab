import java.text.DecimalFormat;

/**
 * Created by aaronmarton on 23/03/2017.
 *
 * implement a table of conversion F to C for common temperatures
 * that a tourist might find it useful (use a for loop and apply the formula from above)
 *
 */
public class tema_6 {
    public static void main(String[] args) {
        double temperature_c;
        DecimalFormat numberFormat = new DecimalFormat("#.0");

        for (double temperature_f = 10; temperature_f < 120; temperature_f += 10) {

            temperature_c = ((float) 5 / 9) * (temperature_f - 32);

            System.out.println("\n" + numberFormat.format(temperature_f) + " Fahrenheit = " + numberFormat.format(temperature_c) + " Celsius");
        }
    }
}
