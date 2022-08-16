package day22_multiDimensionalsArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*
         Tek katli array'lerde array'i direkt yazdiramiyoruz
         cunku array non-primitive data turudur ve
         her non-primitive data turu direkt yazdirilamayabilir

         ancak array'in icerisindeki elementleri direkt yazdirabiliyorduk
         cunku genelde primitive data turu veya String elementler kullaniliyordu

         Multi-dimensional array'lerde en cok dikkat edecegimiz konu
         ulasmak istedigimiz elementin bir array mi yoksa
         primitive data mi oldugudur
         */

        int[][] sayilar = {{1, 2, 4, 5}, {3, 4}};
        /*
         Burada sayilar arrayini dusunursek icinde 2 tane inner array var
         sayilar [0] ==> [1,2,4,5]

         Ancak en icteki elementlere ulasirsak yazdirabiliriz
         */
        System.out.println(sayilar[0]); // [I@30c7da1e
        System.out.println(Arrays.toString(sayilar[0])); //[1, 2, 4, 5]
        System.out.println(sayilar[0][1]); // 2
        System.out.println(sayilar[1][0]); // 3

        System.out.println(Arrays.toString(sayilar)); // [[I@30c7da1e, [I@5b464ce8]
        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 4, 5], [3, 4]]

        /*
         Array'i iki sekilde deklare edebiliyorduk
         1- elemanlari direkt yazabiliriz
         int [][] sayilar = {{1,2,3,4},{3,4}};
         2- outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz

         int [][] sayilar = new int [3][4];

         ancak 2. yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
        Bu ornek icin outer array'in 3 tane inner array'i vardir
        Her bir inner array'in ise 4'er elemani vardir.

        Eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
        mecburen 1.yontemi kullanmalisiniz
        */

    }
}
