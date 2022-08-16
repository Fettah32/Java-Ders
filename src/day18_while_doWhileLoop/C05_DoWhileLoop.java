package day18_while_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Soru-1) 9 dan 190 a kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz
         */

        int bas = 9;
        int bitis = 190;
        int temp = bas;

        // while ile :

        while (temp < bitis) {

            if (temp%7 == 0) {
                System.out.println(temp + " ");
            }
            temp++;
        }

        System.out.println("");

        // do while loop ile
        temp = bas;
        do {

            if (temp%7 == 0) {
                System.out.println(temp + " ");
            }
            temp++;

        }while (temp < bitis);
    }
}
