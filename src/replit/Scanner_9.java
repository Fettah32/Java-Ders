package replit;

public class Scanner_9 {
    public static void main(String[] args) {
        /*
        Girilen zamanı saniyeye çeviren bir program yazınız.

        Örnek Çıktı:

        1 saat 10 dakika 50 saniye ==>

        4250 saniye
         */

        int toplamSaniye, saat, dakika, saniye;
        saat = 1;
        dakika = 10;
        saniye = 50;
        saat *= 3600;
        dakika *= 60;
        toplamSaniye = saat + dakika + saniye ;
        System.out.println(toplamSaniye + " saniye");

    }
}
