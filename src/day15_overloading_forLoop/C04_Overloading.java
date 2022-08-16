package day15_overloading_forLoop;

public class C04_Overloading {
    public static void main(String[] args) {
        topla(5, 7); //12
        topla(5.2, 3); //8.2
        topla(3.4, 6.1); // 9.5
        topla(5, 6.2); // 11.2

    }
    /*
    Java hangi method'un calisacagina karar verirken optimizasyon yapar
    -eger hic cast yapmadan kullanabilecegi bir method varsa onu kullanir
    -eger hic cast yapmadan kullanabilecegi bir method yoksa,
    en az cast yaparak kullanabilecegi method'u tercih eder
     */

    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki integer'in toplami : " + (sayi1 + sayi2));
    }
    /*
    Bir class'da parametre sayisi ve parametre data turleri ayni olan 2 method OLUSTURAMAYIZ
    public static void topla (int sayi3, int sayi4){
        System.out.println("Iki integer'in toplami : " + (sayi3 + sayi4));

     */

    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double ve bir integer'in toplami : " + (sayi1 + sayi2));
    }



    public static void topla(double sayi1, double sayi2) {
        System.out.println("Iki double'in toplami : " + (sayi1 + sayi2));
    }
}


