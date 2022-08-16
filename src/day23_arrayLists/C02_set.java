package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*
         Elimizde urunlerin bulundugu bir liste var
         urun listesindeki istedigimiz siradaki urunu
         yeni urunle degistirip eski urunu,
         var olan eski urunler listesine ekleyelim.
         */

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler = new ArrayList<>();
        // Listedeki ikramin yerine Biskrem koyalim
        // ikrami da eski urunler listesine ekleyelim

        String yeniUrun = "Biskrem";
        String silinecekUrun = "Ikram";

        int temp = urunler.indexOf(silinecekUrun);
        String silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : " + urunler);
        System.out.println("Eski urunler listesi : " + eskiUrunler);

        yeniUrun = "Kahve";
        silinecekUrun = "Cay";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : " + urunler);
        System.out.println("Eski urunler listesi : " + eskiUrunler);


        yeniUrun = "Findik";
        silinecekUrun = "Cekirdek";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : " + urunler);
        System.out.println("Eski urunler listesi : " + eskiUrunler);
    }
}
