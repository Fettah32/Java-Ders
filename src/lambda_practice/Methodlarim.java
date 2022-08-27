package lambda_practice;

import java.util.Comparator;
import java.util.List;

public class Methodlarim { //seed (tohum) methodlar create edildi

    public static boolean ciftElemaniBul(int x) {
        return x % 2 == 0;
        // 2.yol return x % 2!=1;
    }

    public static void altAltaYazdir(Object obj) {
        System.out.println(obj + " ");
    }

    public static void yanYanaYazdir(Object obj) {
        System.out.print(obj + " ");
    }
}
