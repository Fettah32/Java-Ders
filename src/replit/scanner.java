package replit;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.println("Sayi : ");
        sayi = scan.nextInt();
        System.out.println("Sayinin kupunun yarisi : " + ((sayi*sayi*sayi)/2));


    }
}
