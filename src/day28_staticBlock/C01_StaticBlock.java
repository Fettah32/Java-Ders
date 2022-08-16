package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi ;
    static {
        /*
         Static block class uyelerinin tamamindan once calisir
         (main method'dan bile once)

         Static block class olusturuldugunda calisir
         genellikle de class la ilgili
         on ayarlamalar veya static variable'lara
         deger atamak icin kullanilir

         static block'larin class icerisinde
         nerede oldugu onemli degildir once static block'lar calisir

         Birden fazla static block varsa yukaridan asagi dogru calisir
         */
        System.out.println("Statik blok calisti.");
        sayi = 10;
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti.");
        System.out.println(sayi); // 0

    }

    static {
        System.out.println("Main method altindaki static block calisti.");
    }
}
