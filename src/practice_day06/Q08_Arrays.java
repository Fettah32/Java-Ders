package practice_day06;

import java.util.Scanner;

public class Q08_Arrays {

     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)


         //o zaman kullanicidan array in boyutunu alacağız, sonra elemanları almamız lazım
        //sonra bu aldığımız 8 elemanlı array in icerisinde kac tanesi 3 e bölünebiliyor
        //  bütün elemanları kontrol etmek icin for döngüsü lazım
          // sart oldugu icin if gerekli
          // ve kac tane dediği icin count gerekli bu soru icinde
        */

    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner oku = new Scanner(System.in);
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ". index'deki sayiyi giriniz : ");
            arr[i] = oku.nextInt();

            if (arr[i] %3 == 0) {
                System.out.println(arr[i] + " 3'e bolunebilen sayi.");
                count++;
            }

        }

        System.out.println("3'e bolunebilen " + count + " sayi vardir.");

    }

}
