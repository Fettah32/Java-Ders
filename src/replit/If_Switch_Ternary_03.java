package replit;

import java.util.Scanner;

public class If_Switch_Ternary_03 {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
         Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:

INPUT :

25

46

OUTPUT :

Numaralarin Toplami:

71
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplamak icin 0'dan buyuk ilk sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("Toplamak icin 0'dan buyuk ikinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        int sayilarinToplami ;
        int basamak = 0;


/*
        if ((sayi1 >= 0) && (sayi2 >= 0)) {
            sayilarinToplami = sayi1 + sayi2;
        }else {
            System.out.println("Yanlis karakter girdiniz.");
        }

        while (sayilarinToplami != 0) {
            sayilarinToplami /= 10;
            basamak++;
            if (basamak > 10){
                System.out.println("OverFlow");
            }


*/
    }
}
