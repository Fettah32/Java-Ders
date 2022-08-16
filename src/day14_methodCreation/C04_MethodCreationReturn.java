package day14_methodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {
        //// verilen isim ve soyismi ilk harfi buyuk
        //// geriye kalanlari yildiz olacak sekilde degistirip
        //// bize bu halini donduren bir method olusturun
        //// programin ilerleyen kisimlarinda isim ve soyismi busekilde kullanmak istiyoruz

        String isim = "Enes";
        String soyisim = "Bozkurt";

        String gizliIsim = isimGizle(isim, soyisim);
        System.out.println(isim + " " + soyisim);
        System.out.println(gizliIsim); // E*** B******

    }

    private static String isimGizle(String isim, String soyisim) {
        isim = isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w", "*");
        soyisim = soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w", "*");

        return isim+ " " + soyisim ;

    }
}
