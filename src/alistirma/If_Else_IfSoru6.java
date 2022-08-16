package alistirma;

import java.util.Scanner;

public class If_Else_IfSoru6 {
    public static void main(String[] args) {
        /*
         Kullanicidan iki tane sayi isteyin,sayilarin ikisi de pozitifse sayilarin toplamini yazdirin,
         sayilarin ikisi de negatif ise sayilarin carpimini yazdirin,
         sayilarin ikisi farkli isaretlere sahip ise "Farkli isretlerde sayilarla carpim yapamazsin" yazdirin,
         sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen islem icin ilk sayiyi girin : ");
        int ilkSayi = scan.nextInt();
        System.out.println("Lutfen islem icin ikinci sayiyi girin : ");
        int ikinciSayi = scan.nextInt();

        if (ilkSayi > 0 && ikinciSayi > 0) {
            System.out.println("Iki sayi da pozitif oldugu icin toplamlari : " + (ilkSayi + ikinciSayi));
        } else if (ilkSayi < 0 && ikinciSayi < 0) {
            System.out.println("Iki sayi da negatif oldugu icin carpimlari : " + (ilkSayi * ikinciSayi));
        } else if ((ilkSayi > 0 && ikinciSayi < 0) || (ilkSayi < 0 && ikinciSayi > 0) ) {
            System.out.println("Farkli isaretlerde sayilarla carpim yapamazsin.");
        } else if (ilkSayi == 0 || ikinciSayi == 0) {
            System.out.println("Sifir carpima gore yutan elemandir.");
        } else {
            System.out.println("Lutfen sadece sayi giriniz.");
        }
    }
}
