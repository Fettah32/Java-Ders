package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
         split method'u bir array method'u degil String method'udur
         Ama Array dondurdugu icin bu konuda anlatiyoruz

         Split ile herhangi bir String'i istedigimiz sekilde parcalara bolup
         bir array haline getiriyoruz.
         */

        String str = "Java ne kadar guzel";
        String [] kelimeler = str.split(" "); // [Java, ne, kadar, guzel]
        System.out.println(Arrays.toString(kelimeler));

        String [] kelimelerNE = str.split("ne"); // [Java ,  kadar guzel]
        System.out.println(Arrays.toString(kelimelerNE));

        String [] kelimelerE = str.split("e"); // [Java n,  kadar guz, l]
        System.out.println(Arrays.toString(kelimelerE));

        String [] kelimelerHarf = str.split(""); // [J, a, v, a,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l]
        System.out.println(Arrays.toString(kelimelerHarf));



    }
}
