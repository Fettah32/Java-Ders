package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
         Kullanicidan tam sayilar alin.
        Kullanici cift sayi girdigi muddetce sayilari yazdirin
        Tek sayi girdiginde islemi bitirin
         */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        // While ile
        /*
         Loop'larda kullanacagimiz variable'lari loop'tan once hazrilamaliyiz
         while loop'ta, loop'tan once olustrudugumuz bu variable'a atayacagimiz
         degeri iyi dusunmemiz gerekiyor
         */

        while (sayi % 2 == 0) {

            System.out.print("Lutfen bir sayi giriniz : ");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girilen sayi tek, benden bu kadar :)) ");
            }
        }

        // do while loop ile yapalim :
        // do while loop'ta onceden olusturulan variable'a hangi degerin atandiginin
        // hic bir onemi yok, kodumuz her durumda calisir

        /*
        do-while'in dezavantaji;
        ilk calistirma kontrol yapilmadan oldugu icin
        loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
         */

        do {

            System.out.print("Lutfen bir sayi giriniz : ");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girilen sayi tek, benden bu kadar :)) ");
            }

        } while (sayi % 2 == 0);

    }


}

