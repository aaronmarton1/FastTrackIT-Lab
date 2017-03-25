//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class exercitii1 {
    public static void main(String[] args) {
        int numar = SkeletonJava.readIntGUI("Introduceti un numar: ");
        if(numar >= 0) {
            int patrat = numar * numar;
            SkeletonJava.printGUI("Aici este patratul: " + patrat);
        } else {
            SkeletonJava.printGUI(numar);
        }

    }
}
