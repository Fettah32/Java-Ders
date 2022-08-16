package day27_staticKeyword;

public class C01 {

    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {

        /*
         Class level'da iki tur variable olusturabiliriz
         Static (class) variable
         instance (obje) variable

         static variable'lar tum class'dan kullanilabilirken
         instance olanlar sadece static olmayan method'larda direk kullanabilir
         instance variable'lara static method'dan ulasmak istersek
         obje olusturmamiz gerekir

         instance variable'lar obje variable'i olusturdugumuz icin
         herhangi bir satirda instance variable'in degerinin ne oldugunu
         bulmak icin !!!obje olusturulan satirdan!!! itibaren kod incelenmelidir

         static variable'lar class variable'i oldugu icin
         herhangi bir satirda static variable'in degerini bulmak icin
         !!!class'in basindan!!! itibaren kod incelenmelidir.
         */

        C01 obj1 = new C01();
        System.out.println("obj1'in rakam degeri : " + obj1.rakam); //5
        System.out.println("obj1'in sayi degeri : " + obj1.sayi); //10

        obj1.rakam += 1; //5+1=6
        sayi += 1; // 10+1=11

        System.out.println("obj1'in 1 arttirdiktan sonra rakam degeri : " + obj1.rakam); //6
        System.out.println("obj1'in 1 arttirdiktan sonra sayi degeri : " + obj1.sayi); //11

        C01 obj2 = new C01();

        System.out.println("obj2'in 1 rakam degeri : " + obj2.rakam); // 5
        System.out.println("obj2'in 1 sayi degeri : " + obj2.sayi); // 11

        obj2.rakam ++; // 5+1=6
        obj2.sayi ++; // 11+1=12

        System.out.println("obj2'in 1 arttirdiktan sonra rakam degeri : " + obj2.rakam); // 6
        System.out.println("obj2'in 1 arttirdiktan sonra sayi degeri : " + obj2.sayi); // 12


    }
}
