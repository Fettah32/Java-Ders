package replit;

import java.util.Scanner;

public class Scanner_7 {
    public static void main(String[] args) {
        /*
        Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen double bir sayi giriniz : ");
        double sayi = scan.nextDouble();
        int sayi2 = (int)sayi;
        System.out.println(sayi2);
    }
}
