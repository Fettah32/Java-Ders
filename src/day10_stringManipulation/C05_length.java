package day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";
        System.out.println(str.length());// str'in karakter sayisini dondurur    19

        System.out.println(str.charAt(str.length() - 1));// son karaktesini yazdiralim  p
        System.out.println(str.charAt(str.length() - 3));// sondan 3. karakter    k


        /*
        java da null pointer (isaretleyici) bir deger degil'
        karsisinda yazildigi bir variable'in hic bir deger almadiginin isaretcisidir
         */


        String str2 = ""; // str2'ye bir deger atanmis midir? EVET
                          // Bu deger nedir? Hiclik
        System.out.println(str2.length());//0 yazdirir

        String str3= null; // str 3'e bir deger atanmis midir? HAYIR
                           // str 3'e bir deger atanmamistir
                           // null bu deger atamamayi isret etmektedir
        System.out.println(str3.length());//bir deger atanmamis ki nasil uzunlugu olsun???
                                          // NullPointerException  hatasi verir
    }
}
