package replit;

import java.util.Scanner;

public class Scanner_4 {
    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

        1 şeker = 1.7 gr

        Örnek Çıktı:

        Yılda 12.41 kg şeker kullanıyor.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsunuz ve kac seker atiyorsunuz ? :\n(Cevaplar arasinda enter'a basiniz. ");
        int cayMiktari = scan.nextInt();
        int sekerSayisi = scan.nextInt();
        int gunlukSekerMiktari = cayMiktari*sekerSayisi;
        int yillikSekerMIktari = 365*gunlukSekerMiktari;
        double kgYillikSekerMiktari = (yillikSekerMIktari*1.7)/1000;
        System.out.println("Yilda " + kgYillikSekerMiktari + " kg seker kullaniyor.");
    }
}
