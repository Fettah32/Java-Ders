package alistirma;

import java.util.Scanner;

public class Work03_IfStatements {
    public static void main(String[] args) {
        /*
         Kullanicidan gun ismini alin ve hafta ici veya hafta sinu oldugunu yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz : ");
        String girilenGun = scan.nextLine().toLowerCase();

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba") ||
                girilenGun.equals("persembe") || girilenGun.equals("cuma")){
            System.out.println(girilenGun + " Hafta ici ");
        }else if (girilenGun.equals("cumartesi") || girilenGun.equals("pazar")){
            System.out.println(girilenGun + " Hafta sonu ");
        }else {
            System.out.println("Lutfen gecerli bir gun giriniz.");
        }
    }
}
