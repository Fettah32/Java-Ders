package lamda_functional_programming_01;

public class Utils {

    public static void ayniSatirdaBosluiklaYazdir(Object obj) {

        System.out.print(obj + " ");

    }

    public static boolean ciftElemanlariSec(int x) {

        return x % 2 == 0;

    }

    public static boolean tekElemanlariSec(int x) {

        return x % 2 != 0;
    }

    public static int karesiniAl(int x) {

        return x * x;
    }

    public static int kupunuAl(int x) {

        return x*x*x;
    }

    public static double yarisiniAl(int x) {

        return x/2.0;
    }
}