package replit;

import java.util.Scanner;

public class Scanner_10 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen dakika turunden tam sayi giriniz : ");
        int dakikaSayisi = scan.nextInt();
        int yil = 0;
        int gun = 0;
        int saat = 0;
        int kalanDakika = 0;
        int kalanSaat = 0;
        int kalanGun = 0;

        saat = dakikaSayisi / 60;
        kalanDakika = dakikaSayisi % 60;
        gun = saat / 24;
        kalanGun = saat % 24;
        yil = gun / 365;



        System.out.println(dakikaSayisi + " dakika yaklasik " + yil + " yil " + kalanGun + " gundur");



    }
}
