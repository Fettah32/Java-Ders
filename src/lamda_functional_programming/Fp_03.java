package lamda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp_03 {

    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.print(liste);
        System.out.println();


        buyukHarfleYazdir(liste);
        System.out.println();
        //buyukHarfleYazdir02(liste);
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizSirala(liste);
        System.out.println();
        uzunlukVeIlkHarfeGoreSiralaYazdir(liste);
        System.out.println();
        //bestenBuyukleriSil(liste);
        //baslangiciAYadaSonuNOlaniSil(liste);
        //baslangiciAYadaSonuNOlaniSil02(liste);
        //uzunluguSekizIleOnArasiVeOIleBiteniSil(liste);
        System.out.println("uzunluguOnIkidenAzMi(liste) = " + uzunluguOnIkidenAzMi(liste)); // true
        System.out.println("xIleBaslamiyorMu(liste) = " + xIleBaslamiyorMu(liste)); // true
        System.out.println("rIleBitiyorMu(liste) = " + rIleBitiyorMu(liste)); // true


    }

    // 1) Tum elemanlari buyuk harf ile yazdiran bir method olusturun.
    // 1. Yol

    public static void buyukHarfleYazdir(List<String> list) {

        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluiklaYazdir);

    }

    // 2.Yol
   /* public static void buyukHarfleYazdir02(List<String> list) {

        list.replaceAll(String::toUpperCase);
        System.out.println("list = " + list);
    }*/


    // 2) Elemanlari uzunluklarina gore siralayip yazdiran bir method olusturun.

    public static void uzunlugaGoreYazdir(List<String> list) {

        list.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::ayniSatirdaBosluiklaYazdir); // Comparator.comparing() ==> Siralama kosulunu belirtmek icin kullanilir.

    }

    // 3) Elemanlari uzunluklarina gore ters siralayip yazdiran bir method olusturun.

    public static void uzunlugaGoreTersYazdir(List<String> list) {

        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utils::ayniSatirdaBosluiklaYazdir);

    }

    // 4) Elemanlari son karakterlerine gore siralayip tekrarsiz yazdiran bir method olusturun.

    public static void sonKaraktereGoreTekrarsizSirala(List<String> list) {

        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluiklaYazdir);

    }

    // 5) Elemanlari once uzunluklarina gore sonra ilk karakterine gore siralayip yazdiran bir method olusturun.

    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list) {

        list.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).//thenComparing() ==> siralama icin bir kosul daha belirtir
                forEach(Utils::ayniSatirdaBosluiklaYazdir);

    }

    // 6) Uzunlugu 5'ten buyuk olan elemanlari silen bir method olusturun.

//    public static void bestenBuyukleriSil(List<String> list) {
//
//        list.removeIf(t -> t.length() > 5);
//        System.out.println("list = " + list); }
    // ==> list, mutable oldugu icin elemanlari islem sonrasi kalici degistiginden comment-out yapiyorum.

    // 7) 'A', 'a' ile baslayan ya da 'N', 'n' ile biten elemanlari silen bir method olusturun.
    // 1.Yol

//    public static void baslangiciAYadaSonuNOlaniSil(List<String> list) {
//
//        list.removeIf(t -> t.charAt(0) == 'A' || t.charAt(0) == 'a' || t.charAt(t.length()-1) == 'N' || t.charAt(t.length()-1) == 'n');
//
//        System.out.println(list); // [Mark, Christopher, Mariano, Tucker]
//}

    // 2.Yol

//    public static void baslangiciAYadaSonuNOlaniSil02(List<String> list) {
//
//        list.removeIf(t -> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
//
//        System.out.println(list);
//
//    }


    // 8) Uzunlugu 8 ile 10 arasi olan ya da 'o' ile biten elemanlari silen bir method olusturun.

//    public static void uzunluguSekizIleOnArasiVeOIleBiteniSil(List<String> list) {
//
//        list.removeIf(t -> (t.length() > 7 && t.length() < 11) || t.endsWith("o"));
//
//        System.out.println(list);
//
//    }


    // 9) Tum elemanlarin uzunluklarinin 12'den az olup olmadigini kontrol eden bir method olusturun.

    public static boolean uzunluguOnIkidenAzMi(List<String> list) {

        return list.stream().allMatch(t -> t.length() < 12); // true

    }

    // 10) Hicbir elemanin 'X' ile baslamadigini kontrol eden bir method olusturun.

    public static boolean xIleBaslamiyorMu(List<String> list) {

        return  list.stream().noneMatch(t -> t.startsWith("X") ); // true

    }
    
    // 11) Herhangi bir elemanin 'r' ile bitip bitmedigini kontrol eden bir method olusturun.

    public static boolean rIleBitiyorMu(List<String> list) {

        return  list.stream().anyMatch(t -> t.endsWith("r"));
    }

}
