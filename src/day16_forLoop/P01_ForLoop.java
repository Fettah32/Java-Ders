package day16_forLoop;

public class P01_ForLoop {
    public static void main(String[] args) {

        //1' den 100'e kadar olan tam sayilari toplayin
        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam += i;

        }
        System.out.println("Toplam : " + toplam);

        // Verilen iki sayinin ilkinden baslayip ikinciye kadar
        // 3'er 3'er yazdirin ( ikinci sayi sartlari saglamiyorsa yazdirilmayabilir)

        int bas = 20;
        int bitis = 61;
        for (int i = bas; i <= bitis; i+=3) {
            System.out.print(i + " ");
        }
        }
    }

