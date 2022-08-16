package practice_day06;

import java.util.Scanner;

public class Q10_Interview {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String input = scan.nextLine();
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.println("IlkSonHarf(input, sayi) : " + ilkSonHarf(input, sayi));

        ilkSonHarf (input, sayi);



    }

    public static String ilkSonHarf(String str, int n) {
        String s = str.substring(0,1) + str.substring(str.length()-1);
        String sonuc = "";

        for (int i = 1; i <= n  ; i++) {
            sonuc += s;
        }



        return sonuc ;
    }
}
