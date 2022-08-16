package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

        // exception : istisna
        /*
        Bir sorunla karsilasmayi beklediginiz noktalarda
        if else ile sorunu yakalayip
        onunla ilgili bir cozum uretebilirsiniz

        ama sorunu her zaman if-else ile cozemeyecegimizden
        Java try-catch bloklari olusturmustur
         */

        int a = 1000;
        int b = 50;
        int sayac = 1;

        while (sayac < 1000) {

            if (b == 0) {
                System.out.println("islem yapilirken payda sifir oldu, dikkat etmelisiniz");
            } else {
                System.out.println(a / b);

            }
            b--;
            sayac++;
        }
    }
}