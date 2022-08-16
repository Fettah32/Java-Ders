package day25_conctructor;

public class C03 {
    /*
    proje olustururken bazi calass'lar run etmek icin degil
    variable ve method olusturup
    bunlari baska class'lardan kullanmak icin olusturulur
     */

    /*
    Default constructor, parametresizdir. Goremesek bile
    ihtiyac oldugunda calisir. Default constructor acayip kiskanctir,
    uzerine gul koklatmaz. Bir constructor daha olusturdugunuz eski default
    constructor calismaz, kullanilmaz.
     */

    /*
     !!!Default constructor parametresizdir goremesek bile
     ihtiyac oldugunda calisir

     !!! Class icerisinde parametreli veya parametresiz
     herhangi bir constructor olusturursak Java default
     constructor'i siler (Kiskanctir)!!!
     */

    C03(){

    }

    /*
    Olusturdugumuz parametresiz bu constructor default
    constructor ile birebir aynidir
    Ama biz olusturdugumuz icin buna default constructor demeyiz
    Parametresiz constructor deriz.

     */

    String isim = "Etka";

    public void method01(){
        System.out.println("C03 method calistir.");
        System.out.println(isim);
    }
}
