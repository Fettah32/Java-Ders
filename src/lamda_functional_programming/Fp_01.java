package lamda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Fp_01 {

    /*
    1-) Lambda (Functional Programming) Java 8 ile kullanilmaya baslanmistir.
    2-) Functional Programming'de "Ne yapilacak" (What to do?) uzerine yogunlasilir.
        (Structured Programming) --> "Nasil yapilacak" (How to do) uzerine yogunlasir.
    3-) Functional Programming Arrays ve Collections ile kullanilir.
    4-) "entry set()" methodu ile Map, Set'e donusturulerek Functional Programming'de kullanilir.
     */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirStructured(liste);

        System.out.println();

        listElemanlariniYazdirFunctional(liste);

        System.out.println();

        ciftElemanlariYazdirStructured(liste);

        System.out.println();

        ciftElemanlariYazdirFunctional(liste);

        System.out.println();

        tekElemanlarinKareleriniYazdir(liste);

        System.out.println();

        tekElemanlarinKupleriniTekrarsizYazdir(liste);

        System.out.println();

        tekrarsizCiftElemanlarinKareToplami(liste);

        tekrarsizCiftElemanlarinKupununCarpimi(liste);

        getMaxElement01(liste);

        getMaxElement02(liste);

        getMinElement(liste);

        getYedidenBuyukCiftMin(liste);

        getYedidenBuyukCiftMin02(liste);

        getYedidenBuyukCiftMin03(liste);

        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);


    }

    //1) Ardışık list elementlerini aynı satırda
    // aralarında boşluk bırakarak yazdıran bir
    // method oluşturun.(Structured)

    public static void listElemanlariniYazdirStructured(List<Integer> list) {

        for (Integer w : list
        ) {
            System.out.print(w + " "); // 8 9 131 10 9 10 2 8
        }
    }

    //1)Ardışık list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " ")); //8 9 131 10 9 10 2 8
        // stram method'u collection'dan elementleri akisa dahil etmek icin
        // ve methodlara ulasmak icin kullanilir.

    }

    //2) Cift list elementlerini aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer> list) {

        for (Integer w : list
        ) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }

    }

    //2)Cift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {

        list.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));

    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {

        list.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " ")); // 81 17161 81
        // elemanlarin degerleri degisecekse map() method'u kullanilir.

    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekElemanlarinKupleriniTekrarsizYazdir(List<Integer> list) {

        list.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " ")); // 729 2248091

    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {

        Integer toplam = list.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);

        System.out.println(toplam); // 168

    }

    // 6) Tekrarsiz cift elemanlarin kupunun carpimini hesaplayan bir method olusturun.

    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list) {

        Integer carpim = list.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t * t).
                reduce(1, (t, u) -> t * u);

        System.out.println(carpim);

    }

    // 7) List elemanlari arasindan en buyuk degeri bulan bir method olusturun.
    // 1. Yolu

    public static void getMaxElement01(List<Integer> list) {

        Integer max = list.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);

        System.out.println(max);
    }

    // 2. Yol

    public static void getMaxElement02(List<Integer> list) {

        Integer max = list.
                stream().
                distinct().
                sorted().
                reduce(Integer.MIN_VALUE, (t, u) -> u);

        System.out.println("max = " + max); // 131
    }

    // Odev
    // 8) List elemanlari arasindan en kucuk degeri bulan bir method olusturun. (2. Yol ile)

    public static void getMinElement(List<Integer> list) {

        Integer min = list.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u) -> u);

        System.out.println("min = " + min);

    }

    //9) List elemanlari arasindam 7'den buyuk, cift, en kucuk degeri bulan bir method olusturalim.
    // 1. Yol

    public static void getYedidenBuyukCiftMin(List<Integer> list) {

        Integer min = list.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);

        System.out.println("min = " + min); // min = 8
    }

    // 2. Yol

    public static void getYedidenBuyukCiftMin02(List<Integer> list) {

        Integer min = list.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u) -> u);

        System.out.println("min02 = " + min); // min02 = 8
    }

    //3. Yol

    public static void getYedidenBuyukCiftMin03(List<Integer> list) {

        Integer min = list.
                stream().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted().
                findFirst().
                get();

        System.out.println("min03 = " + min);

    }

    // 10) Ters siralama ile tekrarsiz ve 5'ten buyuk elemanlarin
    // yeri degerlerini (elemanin ikiye bolum sonucunu) bulan bir method oluşturun.

    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {

        List<Double> sonuc = list.
                stream().
                distinct().
                filter(t -> t > 5).
                map(t -> t / 2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

        System.out.println("sonuc = " + sonuc);

    }

}
