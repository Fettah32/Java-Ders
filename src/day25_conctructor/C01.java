package day25_conctructor;

public class C01 {
    /*
    Java OOP consept kullandigi icin
    olusturulan her class'in ihtiyac oldugunda obje uretebilmesine uygun dizayn etmistir
    Ama her class'dan obje uretilmeyebilir

    Bunun icin Java ihtiyac halinde kullanilmasi icin her claass'da
    default bir constructor koymustur.

    bu default constructor class'dan obje olusturuldugunda
    otomatik olarak calisir

    ornegin bu class'da constructor gorulmemesine ragmen
    C02 class'inda icinde oldugumuz C01 class'indan bir obje olusturabildik.
     */

    int sayi;

    public void deneme() {
        System.out.println("C01'den deneme method'u calisir.");

        /*
        1- Obje olusturmak icin constructor kullanmak zorundayiz
        2- Constructor'da parametre ile ozellikleri belirlemezsek, java standart bir obje olusturur
        3- Her class'da gormesek bile Java'nin koydugu default constructor vardir
         */
    }
}
