/**
 * Created by aaronmarton on 25/03/2017.
 */
public class SumaNumerelorIntroduse {
    public static void main(String[] args) {

        int numarIntrodus = 0;
        int sumaNumerelor = 0;

        do {
            numarIntrodus = SkeletonJava.readIntConsole("Introduceti un numar intreg: ");

            if (numarIntrodus > 4 && numarIntrodus < 11) {
                sumaNumerelor += numarIntrodus;
            }
        } while (numarIntrodus != 0);

        if (sumaNumerelor != 0) {
            System.out.println("Suma numerelor introduse mai mici dacat 11 si mai mari decat 4 este: " + sumaNumerelor);
        } else {
            System.out.println("S-a introdus 0. Iesire...");
        }
    }
}
