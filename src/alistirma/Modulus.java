package alistirma;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        /*
          Kullanicidan dort basamakli bir sayi alin ve rakamlar toplamini bulun
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 4 basamakli bir pozitif tam sayi giriniz : ");
        int sayi = scan.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi = sayi;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi /= 10;

        System.out.println(ilkGirilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);

    }
}
