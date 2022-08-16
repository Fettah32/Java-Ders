package day22_multiDimensionalsArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        /*
         Array'i array yapan sembol [] idi
         arrayList'de ise <> diamond sembolu kullaniriz
         */

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // []

        // bir list'e eleman eklemek istersek
        isimler.add("Basak");
        System.out.println(isimler); // [Basak]
        System.out.println(isimler.add("Ayse")); // true



        /*
         String'de bir method calistirdigimizda assign yapmazsak string degismiyordu

         String isim = "Suleyman"
         isim.toUpperCase(); // sadece bu satir icin SULEYMAN
         sout ==> Suleyman


         */
        System.out.println(isimler); //[Basak, Ayse]
        /*
         List'in tek kotu tarafi array alt yapisi kullandigi icin
         icerikleri tek tek eklememiz gerekmesidir
         */
    }
}
