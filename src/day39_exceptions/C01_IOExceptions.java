package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Java'da bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz.
        Ayni sekilde Java'dan bilgisayarimizdaki bir dosyaya
        ekleme veya update yapmak istersek
        FileOutputStream Class'indan yardim aliriz.
         */

        FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");

        /*
        Goruldugu gibi compile time'da altini kirmizi cizen her durum
        CompileTimeError degildir
        Java'da bazi exception'lar da
        Compile Time Exception'dir
        Ozellikle dosya okuma ve yazma ilke ilgili exception'lar
        Compile Time Exception'dur

        Compile Time Exception olustugunda Java cozum icin iki ihtimal onerir
        1-) try-catch ile cevrelemek
        2-) method signature'ina throws keyword ile beklenen exception turunu yazmak

        throws Exception sadece olayin farkinda oldugumuzun deklarasyonudur
        exception'in handle edilmesinde hicbir rolu yoktur
        Yani try catch ile kontrol altina aldigimiz exception'larda
        kod calismaya devam ediyordu
        Ancak throws Exception yazdigimizda Java bir exception ile karsilasirsa
        hicbir sey yapmamisiz gibi hata mesaji yayinlayip calismayi durdurur
         */
    }
}
