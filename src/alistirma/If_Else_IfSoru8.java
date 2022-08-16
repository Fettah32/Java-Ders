package alistirma;

import java.util.Scanner;

public class If_Else_IfSoru8 {
    public static void main(String[] args) {
        /*
         Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
             Teklif 80.000 in uzerinde ise "Kabul ediyorum",
             60.000 - 80.000 arasinda ise "Konusabiliriz",
             60.000 in altinda ise "Maalesef kabul edemem" yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen maas teklifinizi sayisal olarak giriniz : ");
        double maasTeklifi = scan.nextDouble();

        if (maasTeklifi >= 80.000) {
            System.out.println("Kabul ediyorum");
        } else if (maasTeklifi >= 60.000) {
            System.out.println("Konusabiliriz");
        } else if (maasTeklifi < 60.000) {
            System.out.println("Maalesef kabul edemem.");
        } else {
            System.out.println("Lutfen gecerli bir teklif giriniz.");
        }
    }
}
