/**
 * Created by aaronmarton on 18/03/2017.
 */
public class Exercitii2 {
    public static void main(String[] args) {
        int numar;
        numar = SkeletonJava.readIntConsole("introducetri un numar: ");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i * numar);
        }
    }
}
