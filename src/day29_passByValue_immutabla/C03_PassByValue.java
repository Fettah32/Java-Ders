package day29_passByValue_immutabla;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        Bir list olusturalim
        iki ayri method olusturalim
        method'lardan birinde
        sadece elemanlari degistirelim

        digerinde yeni bir list atayip,
        ayni sayida yeni eleman ekleyelim

        ve her iki method call'dan sonra kendi listemizi
        main method icinde kontrol edelim
         */

        List<String> list = new ArrayList<>();
        list.add("ALi");
        list.add("Veli");
        list.add("Can");

        System.out.println("ilk basta list : " + list);

        elemanlariDegistir(list);

        System.out.println("eleman deistir method'undan sonra listemiz : " + list);

        listDegistir(list);

        System.out.println("list degistir method'undan sonra list : " + list);

    }

    public static void listDegistir(List<String> list) {
        list = new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("list degistir method'unda : " + list);
    }

    public static void elemanlariDegistir(List<String> list) {

        list.set(0, "Oguz");
        list.set(1, "Murat");
        list.set(2, "Fatih");

        System.out.println("eleman degistir method'unda :" + list);
    }
}
