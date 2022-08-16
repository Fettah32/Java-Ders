package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /*
        1- Verilen sayi1 ve sayi2 variable larinin degerlerini degistiren (SWAP) bir program yaziniz
        Orn : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
        sayi1=20 ve sayi2=10
         */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        // sayi3= gecici kovamiz
        // adim1  sayi2 yi bos kovaya koyalim
        sayi3 = sayi2;  // 10     20     20

        //adım2    sayi1 i sayi2 ye atayacagiz
        sayi2 = sayi1;   // 10     10    20

        //adım3     bos kovadaki sayiyi sayi1 e atayalim
        sayi1 = sayi3;   // 20     10      20

        System.out.println("swap'tan sonra sayi1 :" + sayi1); // 20
        System.out.println("swap'tan sonra sayi2 :" + sayi2); // 10

    }
}
