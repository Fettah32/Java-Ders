package day39_exceptions;

import static java.lang.Integer.parseInt;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str = "123a5";

        int sayi = 0;
        try {
            sayi = parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sadece rakamlardan olusmalidir");
        } catch (Exception e) {
            System.out.println("Ongorulemeyen bir hata olustu");

            System.out.println("Sayinin karesi : " + sayi * sayi);

        /*
        Kullanicidan String olarak bir deger aliyor ve bunu
        int'e ceviriyorsak
        NumberFormatException ile karsilasabilecegimizi ongoruruz
        NFE aldigimizda kodun durmamasini istiyorsak
        try-catch ile cevreleyebiliriz

        Eger bilmedigim bir exception daha olusursa
        kodum durmasin istiyorsak
        bir kere daha catch cumlesi ekleyip
        ona en genis exception'i yazabiliriz
         */
        }
    }
}
