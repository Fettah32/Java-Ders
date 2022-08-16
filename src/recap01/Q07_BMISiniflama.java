package recap01;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {
        /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu cm olarak yaziniz : ");
        double boy = scan.nextDouble()/100;

        System.out.print("Lutfen kilonuzu kg olarak yaziniz : ");
        double kilo = scan.nextDouble();

        double BMI = kilo / (boy*boy);
        System.out.println("Vucut Kitle Endeksiniz : " + BMI);

        if (BMI <= 20) {
            System.out.println("Oldukca zayifsiniz. ");
        } else if (20 <BMI && BMI <= 25) {
            System.out.println("Normal sinirlardasiniz. ");
        } else if (25 < BMI && BMI <= 30) {
            System.out.println("Sisman kategorisindesiniz. ");
        }else {
            System.out.println("Obez grubundasiniz. ");
        }


    }
}
