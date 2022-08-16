package recap01;

import java.util.Scanner;

public class Q09_NestedIf {
    public static void main(String[] args) {
         /*
    Kullanici dan yas bilgisini alarak
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi yaziniz : ");
        int yas = scan.nextInt();

        if (yas >= 18) {
            System.out.println("Oy kullanmaya uygun.");
            if ( yas >= 18 && yas < 50) {
                System.out.println("Bir kez oy kullanabilir. ");
            }else if (yas >= 50 && yas < 70) {
                System.out.println("Iki kez oy kullanabilir. ");
            }else {
                System.out.println("Uc kez oy kullanabilir. ");
            }



        }else if (yas < 18) {
            System.out.println("Oy kullanmaya uygun degildir.");
        }

    }
}
