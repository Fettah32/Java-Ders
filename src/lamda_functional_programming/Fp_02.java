package lamda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp_02 {

    /*
    1-) t -> "Logic" , (t, u) -> "Logic"
    Bu yapiya "Lambda Expression"
    2-) Functional Programming kapsaminda "Lambda Expression" kullanilabilir ama onerilmez.
        "Lambda Expression" yerine "Method Reference" tercih edilir.
    3-) "Method Reference" kullanimi "Class Name :: Method Name"
        Ayni zamanda kendi class'larinizi da kullanabilirsiniz
        Ornegin bir Animal Class'iniz var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
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

        listElemanlariniYazdirFunctional(liste);

        System.out.println();

        ciftElemanlariYazdirFunctional(liste);

        System.out.println();

        tekElemanlarinKareleriniYazdir(liste);

        System.out.println();

        tekElemanlarinKupleriniTekrarsizYazdir(liste);

        System.out.println();

        tekrarsizCiftElemanlarinKareToplami01(liste);

        tekrarsizCiftElemanlarinKareToplami02(liste);

        tekrarsizCiftElemanlarinKareToplami03(liste);

        tekrarsizCiftElemanlarinKupununCarpimi(liste);

        getMaxEleman(liste);

        getMinEleman(liste);

        yedidenBuyukCiftMin(liste);

        tersSiralamaylaTekrarsizElemanlarinYarisi(liste);

    }

    //1) Ardışık list elementlerini aynı satırda
    // aralarında boşluk bırakarak yazdıran bir
    // method oluşturun.(Functional ve method reference)

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(Utils::ayniSatirdaBosluiklaYazdir);
    }

    // 2) Ardisik cift list elemanlarini ayni satirda aralarinda bosluk birakarak yazdiran bir method oluşturun. (Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {

        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluiklaYazdir);

    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {

        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluiklaYazdir);

    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekElemanlarinKupleriniTekrarsizYazdir(List<Integer> list) {

        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluiklaYazdir);
    }

    // 5) Tekrarsiz cift elemanlarin karelerinin toplamini hesaplayan bir method olusturun.

    public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0, Math::addExact);

        System.out.println("toplam = " + toplam);
    }

    // 2.yol
    public static void tekrarsizCiftElemanlarinKareToplami02(List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(Math::addExact).get();

        System.out.println("toplam = " + toplam);

    }

    //3.yol
    public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0, Integer::sum);

        System.out.println("toplam = " + toplam);

    }

    // 6) Tekrarsiz cift elemanlarin kupunun carpimini hesaplayan bir method olusturun.

    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list) {

        Integer carpim = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::kupunuAl).reduce(1, Math::multiplyExact);

        System.out.println("carpim = " + carpim); // carpim = 4096000
    }

    // 7) List elemanlari arasindan en buyuk degeri veren bir method olusturun.

    public static void getMaxEleman(List<Integer> list) {

        Integer maxValue = list.stream().distinct().reduce(Math::max).get();

        System.out.println("maxValue = " + maxValue); // 131
    }

    // Odev
    // List elemanlari arasindan en kucuk degeri bulan bir method olusturun.(Method Reference)

    public static void getMinEleman(List<Integer> list) {

        Integer minValue = list.stream().distinct().reduce(Math::min).get();

        System.out.println("minValue = " + minValue); // 2
    }

    // 9) List elemanlari arasindan 7'den buyuk, cift, en kucuk degeri bulan bir method oluşturun.

    public static void yedidenBuyukCiftMin(List<Integer> list) {

        Integer min = list.stream().distinct().filter(t -> t > 7).filter(Utils::ciftElemanlariSec).reduce(Math::min).get();

        System.out.println("min = " + min); // min = 8
    }

    // 10) Ters siralama ile tekrarsiz ve 5'ten buyuk elemanlarin yari degerlerini (elemanin ikiye bolum sonucunu) bulan bir method oluşturun.

    public static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {

        List<Double> sonuc = list.
                stream(). // Gerekli methodlari kullanmamizi saglar.
                distinct(). // Tekrarli olanlari almaz.
                filter(t -> t > 5). // Kosula gore filtreleme yapar.
                map(Utils::yarisiniAl). // Her bir elemanin degerini degistirmeye yarar.
                sorted(Comparator.reverseOrder()). // siralama yapar
                collect(Collectors.toList()); // elemanlari collection'a gecirir.

        System.out.println("sonuc = " + sonuc); // sonuc = [65.5, 5.0, 4.5, 4.0]
    }

}
