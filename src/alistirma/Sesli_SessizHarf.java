package alistirma;

import java.util.Scanner;

public class Sesli_SessizHarf {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf  girmesini isteyin. Girilen harf sesli ise sesli harf olduğunu,
        sessiz ise sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada 1 karakterden fazla ise
        hata mesajı göstersin. (test girilen harfi büyük yada küçük duyarlıdır)
        örnek: sesli harfler : a,e,ı,u,o
        w.x girdiğinde yanlış karakter girsin uyarısı versin
 */

        Scanner al = new Scanner(System.in);
        String sesliHarfler = "a,e,i,u,o,A,,E,I,U,O";
        boolean kontrol = false;

        do {
            System.out.println("Bir harf giriniz : ");
            String harf = al.nextLine();
            if (harf.length() >= 2 || harf.charAt(0) < 'A' || harf.charAt(0) > 'z') {
                System.out.println("Hatali metin girdiniz.");
            } else if (sesliHarfler.contains(harf)) {
                System.out.println("Sesli harf girdiniz. ");
                kontrol = true;
            }else {
                System.out.println("Sessiz harf girdiniz.");
                kontrol = true;
            }
        } while (kontrol == false);
    }
}
