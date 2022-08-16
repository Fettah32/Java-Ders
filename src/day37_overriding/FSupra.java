package day37_overriding;

public class FSupra extends EToyota{


    void yakit(){
        System.out.println("Supra benzin kullanir.");
        /*
        Private method'lar override edilemez
        Eger Child class'da parent class'daki private method ise
        ayni signature'da bir method olusturursaniz
        bu overriding method OLMAZ
         */
    }

    @Override
    void motor() {
        System.out.println("Sirali 6 silindir 2JZ motoru kullanir.");

        /*
        @Override notasyonu Java'ya bir gorev verir
        Java bu notasyonla birbirine bagli olan iki method'u
        surekli kontrol eder
        Eger parent class'daki overriden method'u silerseniz
        CTE verir.

        @Override notasyonu kullanmak zorunlu degildir
        Eger Overriding method silinirse, kodun CTE
         */
    }
}
