package recap01;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {
    public static void main(String[] args) {
        /*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi yaziniz : ");
        double yas = scan.nextDouble();
        System.out.println("Kilonuzu yaziniz : ");
        double kilo = scan.nextDouble();


        if (yas < 18) {
            System.out.println("Kan bagisi yapamazsiniz.");
        }else if (yas > 18 && kilo < 50) {
            System.out.println("Kan bagisi yapamazsiniz.");
        }else {
            System.out.println("Kan bagisi yapabilirsiniz.");
        }

    }
}
