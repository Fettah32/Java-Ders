package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        Binary search Java'da eleman aramanin kisa yoludur
        Ancak binary search'un calismasi icin once array'in
        sirali hale getirilmesi gerekir
        Eger sirilama yapmadan binary search yaparsaniz
        sonucu bulamayabilir veya yanlis bulabilir
         */

        String[] harfler = {"Y", "B", "D", "G", "O", "A"};

        String arananHarf = "A";


        System.out.println(Arrays.binarySearch(harfler, arananHarf));
        System.out.println(C03_Contains.contains(harfler, arananHarf));

        // binarySearch bize aradigimiz elemanin index'ini dondurur
        // Array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        // Emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler, arananHarf));
        System.out.println(C03_Contains.contains(harfler, arananHarf));

    }
}
