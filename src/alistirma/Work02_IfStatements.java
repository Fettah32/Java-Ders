package alistirma;

import java.util.Scanner;

public class Work02_IfStatements {
    public static void main(String[] args) {
        /*
         Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve
         o harfle baslayan gun isimlerini yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin bas harfini giriniz :");
        String gunIlkHarf = scan.next().toUpperCase();

        if(gunIlkHarf.equals("P")){
            System.out.println("P ile baslayan gunler : Pazartesi, Persembe, Pazar");
        }else if (gunIlkHarf.equals("S")){
            System.out.println("S ile baslayan gun : Sali");
        } else if (gunIlkHarf.equals("C")) {
            System.out.println("C ile baslayan gunler : Carsamba, Cuma, Cumartesi");
        }else {
            System.out.println("Lutfen dogru harf giriniz.");
        }


    }
}
