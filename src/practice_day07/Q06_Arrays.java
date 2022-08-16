package practice_day07;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
       public static void main(String[] args) {
           farkiniBul();
       }

    public static void farkiniBul() {
           Scanner scan = new Scanner(System.in);
        System.out.print("Array'in uzunlugunu giriniz : ");
        int uzunluk = scan.nextInt();
        int [] arr = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array'in " + (i+1) + ". elemanini giriniz" ); // i --> oldugunda sifirinci eleman diyecek, bizindex degil, direk eleman sorduk
            arr[i] =scan.nextInt(); // fori den gelen indexler, bu satirda kullanici tarafindan dongu bitene kadar girilen elemanlar okunur
        }

        Arrays.sort(arr);
        System.out.println("array'deki en buyuk eleman ile en kucuk eleman arasindaki fark : " + (arr[uzunluk-1]-arr[0]));
    }

}
