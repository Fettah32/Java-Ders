package practice_day10.okul_proje;

import day26_constructor.Ogretmen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
   /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */


    public static void main(String[] args) {
        System.out.println("Hosgeldiniz Okulumuza ");

        System.out.print("Isim giriniz : ");
        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();

        System.out.print("Soyisim giriniz : ");
        String soyisim = scan.nextLine();

        System.out.print("Yasinizi giriniz : ");
        int yas = scan.nextInt();

        System.out.print("Bransinizi giriniz : ");
        String brans = scan.next();

        scan.nextLine(); // dummy hayalet komut

        System.out.print("Telefon no giriniz : ");
        String tel = scan.nextLine();

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyisim, yas, brans, tel);

        List<OgretmenBilgileri> ogretmenList = new ArrayList<>();

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);

    }
}
