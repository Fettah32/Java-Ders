package recap01;

import java.util.Scanner;

public class Q03_BMI {
    public static void main(String[] args) {
        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen agirliginizi kg olarak giriniz : ");
        double agirlik = scan.nextDouble();

        System.out.print("Lutfen boyunuzu cm cinsinden giriniz : ");
        double boy = scan.nextDouble();

        //boy = boy/100; // metre olarak deger alabilmek icin
        boy/=100;

        double vke = agirlik/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz (VKE) : " + vke);

    }
}
