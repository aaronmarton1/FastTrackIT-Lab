import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaronmarton on 25/03/2017.
 */
public class AfisarePerechNumereDinSir {
    public static void main(String[] args) {
        int[] sirDeNumere = {11, 13, 9, 8, 16};

        int contor = 0;
        int primulNumar = sirDeNumere[0];

        System.out.print("Urmatoarele perechi de numere au primul numar mai mare decat al doilea: ");

        for (int numar : sirDeNumere) {

            if (numar < primulNumar) {
                System.out.print("[" + primulNumar + "," + numar + "] ");
            }

            primulNumar = numar;
        }
    }
}
